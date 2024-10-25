FROM maven:3.8.6-openjdk-8 

WORKDIR /app

COPY . ./

RUN mvn clean package -DskipTests

CMD [ "mvn" , "spring-boot:run" ]
