# test-static-resource-options

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/test-static-resource-options-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- REST Client Classic ([guide](https://quarkus.io/guides/rest-client)): Call REST services
- YAML Configuration ([guide](https://quarkus.io/guides/config#yaml)): Use YAML to configure your Quarkus application
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing JAX-RS and more
- SmallRye JWT ([guide](https://quarkus.io/guides/security-jwt)): Secure your applications with JSON Web Token
- SmallRye Health ([guide](https://quarkus.io/guides/microprofile-health)): Monitor service health
- SmallRye Metrics ([guide](https://quarkus.io/guides/microprofile-metrics)): Expose metrics for your services
- SmallRye OpenTracing ([guide](https://quarkus.io/guides/opentracing)): Trace your services with SmallRye OpenTracing
- Narayana JTA - Transaction manager ([guide](https://quarkus.io/guides/transaction)): Offer JTA transaction support (included in Hibernate ORM)
- Hibernate Validator ([guide](https://quarkus.io/guides/validation)): Validate object properties (field, getter) and method parameters for your beans (REST,
  CDI, JPA)
- SmallRye OpenAPI ([guide](https://quarkus.io/guides/openapi-swaggerui)): Document your REST APIs with OpenAPI - comes with Swagger UI
- Logging GELF ([guide](https://quarkus.io/guides/centralized-log-management)): Log using the Graylog Extended Log Format and centralize your logs in ELK or EFK
- OpenID Connect ([guide](https://quarkus.io/guides/security-openid-connect)): Verify Bearer access tokens and authenticate users with Authorization Code Flow
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin
- Reactive Routes ([guide](https://quarkus.io/guides/reactive-routes)): REST framework offering the route model to define non blocking endpoints

## Provided Code

### YAML Config

Configure your application with YAML

[Related guide section...](https://quarkus.io/guides/config-reference#configuration-examples)

The Quarkus application configuration is located in `src/main/resources/application.yml`.

### REST Client

Invoke different services through REST with JSON

[Related guide section...](https://quarkus.io/guides/rest-client)

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

### SmallRye Health

Monitor your application's health using SmallRye Health

[Related guide section...](https://quarkus.io/guides/smallrye-health)
