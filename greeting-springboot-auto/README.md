# Spring Boot Greeting application with autoconfiguration

This application shows how to connect to a Cloudant database using the new Spring Boot starter provided by the [Cloudant Spring Library](https://github.com/cloudant-labs/cloudant-spring). The library provides Spring capabilities on top of the official [Cloudant Java library](https://github.com/cloudant/java-cloudant).

## Pre-requisites

* [Apache Maven](https://maven.apache.org/)

## Building and running

Before running create a `src/main/resources/cloudant.properties` file with your Cloudant credentials:

~~~
cloudant.username=cloudantUsername
cloudant.password=cloudantPassword
cloudant.url=cloudantUrl
cloudant.db=databaseName
~~~

To build and run:

* `mvn clean install`
* `java -jar tartet/demo-0.0.1-SNAPSHOT.jar`

Available endpoints:

* `http://localhost:8080/databases`
* `http://localhost:8080/greeting`
* `http://localhost:8080/greeting/{id}`
