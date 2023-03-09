# JavaStart Spring Course

This repository contains examples, excercises and one bigger project form a JavaStart Spring course.

## Table of Contents

- [Getting Started](#getting-started)
- [Examples](#examples)
- [Exercises](#exercises)
- [Project](#project)

## Getting Started

To run the examples in this repository, you will need to have the following tools installed:

- Java 11 or higher
- Maven
- Git

To get started, clone this repository using the following command:
```
git clone https://github.com/patzgn/java-start-spring.git
```
Once you have cloned the repository, navigate to the project directory and run the following command to build and run the examples:
```
mvn spring-boot:run
```
This will start the Spring Boot application and make it available at `http://localhost:8080`. You can then use your web browser or a tool like `curl` to interact with the application. Some examples are console application only.

## Examples

This repository contains a number of examples that cover various topics related to Spring Boot. Each example is contained in its own subdirectory.

The examples included in this repository are:

### Core

- [Dependency Injection](https://github.com/patzgn/java-start-spring/tree/main/00-core/01-dependency-injection)
- [Dependency Inversion](https://github.com/patzgn/java-start-spring/tree/main/00-core/02-dependency-inversion)
- [Inversion of Control](https://github.com/patzgn/java-start-spring/tree/main/00-core/03-inversion-of-control)
- [Profiles](https://github.com/patzgn/java-start-spring/tree/main/00-core/04-profiles)
- [Configuration Class](https://github.com/patzgn/java-start-spring/tree/main/00-core/05-configuration-class)
- [Configuration Properties](https://github.com/patzgn/java-start-spring/tree/main/00-core/06-configuration-properties)

### Data

- [EntityManager and Repositories](https://github.com/patzgn/java-start-spring/tree/main/01-data/01-entitymanager-and-repositories/bikerent)
- [Data JPQL query](https://github.com/patzgn/java-start-spring/tree/main/01-data/02-data-jpql-query)
- [Entity configuration](https://github.com/patzgn/java-start-spring/tree/main/01-data/03-entity-configuration)
- [Test data](https://github.com/patzgn/java-start-spring/tree/main/01-data/04-test-data)

### MySQL

- [MySQL Configuration](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/01-mysql-config)
- [Profiles](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/02-data-dev-prod)
- [Liquibase](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/03-data-liquibase)
- [OneToOne](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/04-one-to-one)
- [OneToMany & ManyToOne](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/05-one-to-many)
- [ManyToMany](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/06-many-to-many)
- [Lazy Eager](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/07-lazy-eager)
- [Cascade](https://github.com/patzgn/java-start-spring/tree/main/02-mysql/08-cascade)

### MVC

- [Controller](https://github.com/patzgn/java-start-spring/tree/main/03-mvc/01-mvc-controller)
- [Home Page and Static Resources](https://github.com/patzgn/java-start-spring/tree/main/03-mvc/02-mvc-home)
- [Parameters](https://github.com/patzgn/java-start-spring/tree/main/03-mvc/03-mvc-params)
- [Forms](https://github.com/patzgn/java-start-spring/tree/main/03-mvc/04-mvc-form-post)
- [MVC Pattern](https://github.com/patzgn/java-start-spring/tree/main/03-mvc/05-mvc-pattern)
- [DTO](https://github.com/patzgn/java-start-spring/tree/main/03-mvc/06-mvc-dto)

### Thymeleaf

- [Instructions](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/01-instructions)
- [Loops](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/02-loop)
- [Spring Boot DevTools](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/03-devtools)
- [Expressions](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/04-expressions)
- [Redirect](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/05-redirect)
- [Forms](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/06-forms)
- [Web URLs](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/07-web-urls)
- [Dynamic Styles](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/08-dynamic-styles)
- [Sessions](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/09-sessions)
- [Fragments](https://github.com/patzgn/java-start-spring/tree/main/04-thymeleaf/10-fragments)

### API
- [Configuration](https://github.com/patzgn/java-start-spring/tree/main/05-api/01-config)
- [Content Type](https://github.com/patzgn/java-start-spring/tree/main/05-api/02-content-type)
- [Parameters](https://github.com/patzgn/java-start-spring/tree/main/05-api/03-params)
- [Response](https://github.com/patzgn/java-start-spring/tree/main/05-api/04-response)
- [CRUD](https://github.com/patzgn/java-start-spring/tree/main/05-api/05-crud)

### Validation
- [Configuration](https://github.com/patzgn/java-start-spring/tree/main/06-validation/01-config)
- [Built In Constraints](https://github.com/patzgn/java-start-spring/tree/main/06-validation/02-built-in-constraints)
- [Custom Constraints](https://github.com/patzgn/java-start-spring/tree/main/06-validation/03-custom-constraints)

### Spring Security
- [Configuration](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/01-config)
- [Login](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/02-login)
- [In Memory Users](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/03-in-mem-users)
- [Security Context](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/04-security-context)
- [Passwords](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/05-passwords)
- [Users DB](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/06-users-db)
- [Authorization](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/07-authorization)
- [Registration](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/08-registration)
- [CSRF](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/09-csrf)
- [H2 Console](https://github.com/patzgn/java-start-spring/tree/main/07-spring-security/10-h2-console)

## Exercises

This repository contains few additional excercises that cover topics mention above.

## Project - Movie Club

The Movie Club Spring Boot project is a web-based application that allows users search for movies and rate them. The application uses Spring Boot and Thymeleaf to provide a seamless and intuitive user experience. It also incorporates features such as user authentication, authorization, and database persistence to ensure data security and privacy.
<p>
<img src="https://user-images.githubusercontent.com/103074854/223948673-dc4fca3e-2a0e-47f4-92c2-5b73ba70e2d8.png" height="620" />
<img src="https://user-images.githubusercontent.com/103074854/223948696-9b8a7d55-d47c-4f99-a989-a1151f1288c8.png" height="620" />
</p>
