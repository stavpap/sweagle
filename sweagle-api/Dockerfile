FROM java:8-jdk-alpine
COPY ./target/sample-docker-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT [“java”,”-jar”,”sample-docker-0.0.1-SNAPSHOT.jar”]