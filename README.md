# Template

This is a simple template using Spring Boot with MongoDB and Spring Data REST to create a REST API with a Swagger documentation.

## Features
* Spring Boot project
* Integration with MongoDB
* Generated Spring Data REST API
* Swagger API documentation
* Dockerfile

## Maven Dependencies
* Spring Web (spring-boot-starter-web)
* Spring Data MongoDB (spring-boot-starter-data-mongodb)
* REST Repositories (spring-boot-starter-data-rest)
* Springfox (springfox-boot-starter)

## Requirements
* JDK 11
* Maven

## Instructions
* Run this command: `./mvnw spring-boot:run`
* REST API will be available at http://localhost:8080/api
* Swagger API documentation will be available at http://localhost:8080/swagger-ui/