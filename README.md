# Microprofile Fault Tolerance with Quarkus Part 2
Microprofile Fault Tolerance with Quarkus | Part 2 | @Timeout | @CircuitBreaker and @Retry

It is increasingly important to build fault-tolerant #microservice. 
The MicroProfile Fault Tolerance feature defines a standard API to implement a set of fault tolerance policies. \
Microprofile Fault Tolerance makes it easy to build resilient microservices that provide reliable function, even when errors occur.

Follow the video tutorial:

[![Alt text](https://user-images.githubusercontent.com/8536722/110162186-aa6eab00-7dee-11eb-8289-bd3cf6c13a11.png)](https://youtu.be/d3YZ-PVex78 "Click to play on Youtube.com")


This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/. \
If you want to learn more about Microprofile, please visit its website: https://microprofile.io/ .

## Running the quarkus-service application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
cd quarkus-service
./mvnw compile quarkus:dev
curl http://localhost:8081/message
```

## Running the quarkus-rest-client application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
cd quarkus-rest-client
./mvnw compile quarkus:dev
curl http://localhost:8080/message
```
