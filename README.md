# unit-testing-in-java

## Swagger API Specs

Swagger API documentation specs are auto-generated when the server runs. The specs will be published under the URL http://localhost:8080/swagger-ui.html#/

## Installing

After checking out the git repo run the following maven command

```bash
mvn install
```

This should install all packages, run all unit tests and exit successfully

## Starting

To start the server please run the following maven command

```bash
mvn spring-boot:run
```

## Testing

To execute the unit tests against the business logic service classes please run the following maven command

```bash
mvn test
```
