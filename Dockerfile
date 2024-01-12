FROM maven:3.8.6-openjdk-8 AS build

WORKDIR /app

COPY /src pom.xml /app

CMD ["mvn", "spring-boot:run"]
