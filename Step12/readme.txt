mvn compile


## The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within 
## the target directory. The name of the JAR file will be based on the project’s
mvn package


## To execute the JAR file run:
java -jar target/spring-boot-first-web-application-0.0.1-SNAPSHOT.jar

## test
http://localhost:8080/login