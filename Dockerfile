FROM openjdk:8-jdk-alpine
ADD target/spring-jenkin-demo-0.0.1-SNAPSHOT.jar spring-jenkin-demo.jar 
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "spring-jenkin-demo.jar" ]
