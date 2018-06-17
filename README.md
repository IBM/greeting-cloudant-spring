# Greetings with Spring and Cloudant

The Cloudant Java SDK has new support for Spring Framework and Spring Boot.

This repository contains a few projects to walk you through what this new support provides when working with Spring and Cloudant.

## Project contents 

1. [greeting-springboot](greeting-springboot/): The "Before" case. This Spring Boot application connects to a Cloudant database using only the Cloudant Java library `com.cloudant:cloudant-client`
2. [greeting-spring-framework](greeting-spring-framework/): This Spring Framework application uses the new `@EnableCloudant` annotation from the `com.cloudant:cloudant-spring-framework` library to connect to a Cloudant database
3. [greeting-springboot-auto](greeting-springboot-auto/): This Spring Boot application uses the new `com.cloudant:cloudant-spring-boot-starter` library to automatically configure and connect to a Cloudant database
4. [greeting-springboot-liberty](greeting-springboot-liberty/): This Spring Boot application uses the autoconfiguration support for Cloudant, but also uses [OpenLiberty](http://openliberty.io) in place of Tomcat.

## Evolution of the Cloudant support for Spring

The official [Cloudant Java Client](https://github.com/cloudant/java-cloudant/) provides libraries for Java applications to connect to, and interact with Cloudant databases. The new [Cloudant Spring Library](https://github.com/cloudant-labs/cloudant-spring) builds on top of the Cloudant Java Client to enable autoconfiguration for Spring Boot applications and exposes an `@EnableCloudant` annotation for Spring Framework applications.

### Overview of evolution

Before the creation of the Cloudant Spring Library developers had to include configuration for Spring beans that connected to Cloudant in their application code. Now the beans are provided by the library.

![alt text](/images/OverviewEvolution.png "Overview of evolution")

Before:
* Cloudant Java client is provided by the library as a dependency in Maven Central
* Spring configuration classes are included in the application

After:
* Cloudant Spring library pulls in Cloudant Java client as a dependency
* Spring configuration classes are pulled in as a dependency in Maven Central

### Detailed evolution

The new Cloudant Spring client provides both the beans used for connecting to Cloudant and the configuration properties file for specifying credential information. The library is pulled in as a dependency from Maven Central.

![alt text](/images/DetailedEvolution.png "Detailed evolution")

Before:
* Cloudant Java client is provided by the library as a dependency in Maven Central called `com.cloudant:cloudant-client`
* Definition of Cloudant beans and properties are included in the application

After:
* Cloudant Spring library pulls in `com.cloudant:cloudant-client` as a dependency
* Cloudant beans and properties are pulled in as a dependency in Maven Central called
`com.cloudant:cloudant-spring-boot-starter` or `com.cloudant:cloudant-spring-framework`
