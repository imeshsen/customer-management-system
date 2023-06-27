#!/bin/bash

docker network create spring-network

docker build -t spring .

docker run -d --name mysql-container --network spring-network -e MYSQL_ALLOW_EMPTY_PASSWORD=true mysql:latest

#docker run -d --name spring-container --network spring-network -p 8080:8080 -e SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/customer?createDatabaseIfNotExist=true -e SPRING_DATASOURCE_USERNAME=root spring

docker run -d --network spring-network -p 8080:8080 -e SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/customer?createDatabaseIfNotExist=true -e SPRING_DATASOURCE_USERNAME=root spring
