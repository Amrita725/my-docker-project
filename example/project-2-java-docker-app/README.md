# Java Docker Application

This project demonstrates how to containerize a simple Java application using Docker.

## Concepts Covered
- Java runtime in containers
- Dockerfile for Java applications
- Difference between build-time and runtime
- JVM inside Docker

## Build Image
```bash
docker build -t java-docker-app .
```
## Run Image
```bash
docker run java-docker-app
```

## Learnings  
- Java images are heavier than Node.js  
- Choosing slim images reduces size  
- Java compilation can be done inside the container
- Build + runtime mixed together (This pain is what **naturally leads to multi-stage Dockerfiles** later)
