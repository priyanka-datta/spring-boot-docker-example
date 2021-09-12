# spring-boot-docker-example

## Steps:

* Creating JAR file in the target folder by running the command 
  ### mvn clean install

* There is DockerFile in the project folder. 
  ### FROM openjdk:8
  by this command we are pulling openjdk repository of version 8 from docker registry.
  ### ADD target/spring-boot-h2-docker.jar spring-boot-h2-docker.jar
  using this command, we are adding the jar file from the target folder to the docker container root directory
  ### EXPOSE 8080
  We are making the port 8080 available for this application running
  ### ENTRYPOINT ["java","-jar","spring-boot-h2-docker.jar"]
  if we run the jar, we will write the command java -jar spring-boot-h2-docker.jar. Same here, we have to mention the each thing separated by comma.
  
* After the jar creation, in the project directory, after opening the terminal, we need to see the docker version using
  ### docker --version

* After that starting the docker, we need to execute below command to build the image
  ### docker build -f Dockerfile -t spring-boot-docker-example
 
* After running the above command, we will see all the steps written in the Dockerfile(mentioned above) are getting executed. After that we will check the images using the below command and will see an image spring-boot-docker-example has got created
  ### docker images
  
* After that we have to run the below command to run the image. Then it will be called container. Image is a static thing. It is called container when it is running. Container is a dynamic thing.
  ### docker run -p 8090:8080 spring-boot-docker-example
here port 8090 is the port where we are going to host the docker application.

* We can check logs using the below command
  ### docker container logs container-id 

After doing the above steps, we can test the endpoints with port 8090. Here in this application using commandLineRunner all data have been added. 
