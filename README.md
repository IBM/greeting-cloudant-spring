# Greetings with Spring and Cloudant

The Cloudant Java SDK has new support for Spring Framework and Spring Boot.

This repository contains a few projects to walk you through what this new support provides when working with Spring and Cloudant.

We have a few projects here: 

1. [greeting-springboot](greeting-springboot/): The "Before" case. This Spring Boot application connects to a Cloudant database using only the Cloudant Java library `com.cloudant:cloudant-client`
2. [greeting-spring-framework](greeting-spring-framework/): This Spring Framework application uses the new `@EnableCloudant` annotation from the `com.cloudant:cloudant-spring-framework` library to connect to a Cloudant database
3. [greeting-springboot-auto](greeting-springboot-auto/): This Spring Boot application uses the new `com.cloudant:cloudant-spring-boot-starter` library to automatically configure and connectto a Cloudant database
4. [greeting-springboot-liberty](greeting-springboot-liberty/): This Spring Boot application uses the autoconfiguration support for Cloudant, but also uses [OpenLiberty](http://openliberty.io) in place of Tomcat.

The following diagrams show the evolution of the Cloudant support for Spring applications and the added value provided by this new library.

Overview of evolution:

![alt text](/images/OverviewEvolution.png "Overview of evolution")

Detailed evolution:

![alt text](/images/DetailedEvolution.png "Detailed evolution")
