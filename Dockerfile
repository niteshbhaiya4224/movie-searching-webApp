# Build stage
FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

# Package stage
FROM openjdk:17-jdk-alpine3.14
WORKDIR /app
COPY --from=build /app/target/login-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "login-0.0.1-SNAPSHOT.jar"]