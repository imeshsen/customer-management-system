FROM maven:3.8.4 AS build

WORKDIR /app

COPY . /app

RUN mvn clean package -DskipTests

FROM openjdk:8-jre-slim

WORKDIR /app

COPY --from=build /app/target/*.jar my-app.jar

EXPOSE 8081

CMD ["java", "-jar", "my-app.jar"]