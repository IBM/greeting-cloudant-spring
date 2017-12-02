# Spring Framework Greeting application

This application shows how to connect to a Cloudant database using the new `@EnableCloudant` annotation provided by the [Cloudant Spring Library](https://github.com/cloudant-labs/cloudant-springofficial). The library provides Spring capabilities on top of the official [Cloudant Java library](https://github.com/cloudant/java-cloudant).

## Pre-requisites

* [Apache Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/)

## Building and running

Before running create a `src/main/resources/cloudant.properties` file with your Cloudant credentials:

~~~
cloudant.username=cloudantUsername
cloudant.password=cloudantPassword
cloudant.url=cloudantUrl
cloudant.db=databaseName
~~~

### To build:

* `mvn clean install`

### When run with STS: 

Available endpoints:

* GET `http://localhost:8080/demo/databases`
```
curl http://localhost:8080/demo/databases
```

* GET or POST  `http://localhost:8080/demo/greeting`
```
curl http://localhost:8080/demo/greeting
curl -H "Content-Type: application/json" -X POST -d '{"content":"Greetings from the README"}' http://localhost:8080/demo/greeting
```

* GET `http://localhost:8080/demo/greeting/{id}`

### To run with docker: 

* `docker build -t cloudantsample .`
* `docker run -it --rm -p 8080:8080 cloudantsample`

Available endpoints:

* GET `http://localhost:8080/databases`
```
curl http://localhost:8080/database
```

* GET or POST `http://localhost:8080/greeting`
```
curl http://localhost:8080/greeting
curl -H "Content-Type: application/json" -X POST -d '{"content":"Greetings from the README"}' http://localhost:8080/greeting
```

* GET `http://localhost:8080/greeting/{id}`
