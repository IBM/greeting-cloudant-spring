FROM tomcat:7.0-jre8

ADD target/war/GreetingSpringFramework.war /usr/local/tomcat/webapps

COPY tomcat-users.xml /usr/local/tomcat/conf

CMD ["catalina.sh", "run"]