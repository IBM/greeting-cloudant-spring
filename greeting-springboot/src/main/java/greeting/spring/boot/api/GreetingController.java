/*
 * Copyright © 2017 IBM Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package greeting.spring.boot.api;

import java.io.IOException;
import java.util.List;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import greeting.spring.boot.model.Greeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private Database db;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Greeting> getAll() throws IOException {
        List<Greeting> allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Greeting.class);
        return allDocs;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public @ResponseBody Greeting getGreeting(@PathVariable String id) throws IOException {
        Greeting greeting = db.find(Greeting.class, id);
        return greeting;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String add(@RequestBody Greeting greeting) {
        Response response = db.post(greeting);
        String id = response.getId();
        return id;
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public ResponseEntity<?> deleteGreeting(@PathVariable String id) throws IOException {
        Greeting greeting = db.find(Greeting.class, id);
        Response remove = db.remove(greeting.get_id(),greeting.get_rev());
        return new ResponseEntity<String>(remove.getReason(), HttpStatus.valueOf(remove.getStatusCode()));
    }
}