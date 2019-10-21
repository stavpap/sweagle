# Sweagle

## Information

This is a Spring Boot 2.1 web application written in the Java programming language destined to run on the JVM with Java 8 (or later). 
In addition a basic UI application is provided in order to test the backend endpoints. The UI was implemented with AngularJs 8.

## Pre-requisites

In order to compile and run the source code of this project
you need to setup:

 - Jdk8
 - Maven 3.5 or later for building and running the app
 - MySql
 - Nodejs v10.16 or later
 - npm

Most Ubuntu Linux distributions with version 18.04 or later
contain all required software in their official repositories.

## Run the application

 - Clone this code to your local machine.
 - Run the schema_intro.sql , in order to create required the database and tables.
 - Run the initial_values.sql in order to insert some initial rows in your database mainly used for tests.
 - Replace the following values in pom.xml with your own database credentials:
 ```
 <url>jdbc:mysql://localhost:3306/sweagle?serverTimezone=UTC</url>
<user>root</user>
<password>root</password>
```
 - Replace the following values in application.properties with your own database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/sweagle?serverTimezone=UTC
 
spring.datasource.username=root

spring.datasource.password=root,
 - From inside the swagger-api folder run mvn spring-boot:run. The api is accesible on http://localhost:8080.
 - From inside the swagger-ui folder run npm install
 - From the same location run npm run ng serve. The UI is accessible through http://localhost:4600

##High level architecture

The following diagram describes the components of the application, as well as some further additions that can be done.

(https://drive.google.com/file/d/1PGKUkkYlXcWShgWxrZIhDK-_tkhcSZ9s/view?usp=sharing)

##Database

The database used is MySQL. Below is the schema of the database.

(https://drive.google.com/open?id=1AuSz0xkCGHLaH4bz-gaKKI6C8GIygIQn)
 
 Some thoughts on the database design:
- In order to achieve the one to one relationship between the datasets and the payloads, the payload table has a column called dataset_id. This column is a foreign key to dataset's id column and also the values of this column are unique. 
 - In order to avoid having datasets without payload, the initial thought was to have also a payload_id foreign, unique key in the dataset table. But this would make our schema more complex and also our code more complex. So keeping it simple with one foreign key was preferred and our code ensures that no datasets are inserted with no payload.
 - The create_date and update_date columns are MySQL timestamps and are stored in UTC. These values  are automatically initialized to the current timestamp , as default value.
 - The data of the payload are stored as BLOB type in the database. This type can store file of a maximum 64KB size. For bigger files there is also MEDIUMBLOB or LONGBLOB. Furthermore a No-SQL database could like MongoDB. MongoDB is a document database with no relations, so is more suitable for storing large files. However if it is necessary to store large files (like high quality images or videos), then a file system based solution should be considered. Of course for each solution there are pros and cons. For databases it is easier to manage replicate, back up and data integrity and consistency. On the other side the file system is designed to store and serve files and there is no limit on the file size. So the business could really help us take the decision.
 - The datasets and payload should be inserted/deleted in a transactional way in our code, so that if a payload is failed to be inserted/deleted then no dataset will be inserted/deleted as well or vice versa.


##API

A RESTful approach was followed on the design of the API. More details can be found on the documentation of the WebController, inside our code. Of course further improvements can be done, some of which are the following:

 - Introduce swagger for API documentation.
 - When creating a resource (dataset) a Location header can be returned with the URI of the new resource.
 - Use PATCH method in order to partially update a dataset or a payload(instead of POST). The URL for these operations will be /datasets/{id} and /datasets/{id}/payloads/{id} respectively. Otherwise, because PATCH is not supported by all browsers PUT can be used on the same URLs.
 - Use "name" as a query parameter on our GET request at the /datasets endpoint on order to filter the get all datasets response. So with name not a specific dataset is fetched but actually the results are filtered by name.


## Source code structure

The main application entry point of this module is found in the
SweagleApiApplication class which bootstraps the spring boot web application.


The http entry points (web controllers) are implemented in the
com.syntax.sweagleapi.controller package, in the class WebController. This class is responsible for intercepting the HTTP request, delegating work to the domain service class.


The domain service layer class resides in the
com.syntax.sweagleapi.service package and is called CRUDService. It contains all the business logic and relies on the database layer for
interactions with the database.


The database access layer classes can be found in the
com.syntax.sweagleapi.repository package. They define the
Spring Data Repositories for interacting with the MySQL database.

# Suggestions for further improvements

 - Code first migrations for db
 - Introduce CI / CD
 - Introduce apache kafka for realtime features, such as notify all the consumers that a new payload introduced or updated
 - Introduce useful metrics for BI, such as what is the max payloads for a given dataset, how many payloads have been created / hour, etc..
 - Introduce a load balancer and run many instances of the app in order to increase the throughput that the application can handle.
 - Introduce async operations on requests to not block the user while submitting large payloads
 - Introduce logging mechanism for a production ready application. Use ELK stack in order to collect and visualize the logs of the application. Use log4j and MDC (Map Diagnose Content) to enrich the logs. Fill the MDC with information related to the whole operation from user request to database transaction and log these information (for example a UUID can be generated and attached to each operation and log all the steps of this operation with this id). The MDC is internally attached to the executing thread.
 - Dockerize the application. An attempt to dockerize the api was with the following Dockerfile: 
FROM java:8-jdk-alpine
COPY ./target/sample-docker-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT [“java”,”-jar”,”sample-docker-0.0.1-SNAPSHOT.jar”]
But because the available workstation is running Windows 10 Home, Docker support is not good on this OS. So the image that was built could not run due to some relative path issue probably. Messaged
was the following: /bin/sh: [“java”,”-jar”,”sweagle-api-0.0.1-SNAPSHOT.jar”]: not found
 - More tests should be added to reach a higher test coverage. Corner cases should be tested. Additionally a test database should be used for integration tests. For now we make the assumption that the initial test data are not deleted and not modified and we test only the get endpoints.