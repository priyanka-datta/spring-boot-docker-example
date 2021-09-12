FROM openjdk:8
ADD target/spring-boot-h2-docker.jar spring-boot-h2-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-h2-docker.jar"]