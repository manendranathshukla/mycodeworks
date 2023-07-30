#
# Build stage
#
FROM maven:3.8.4-openjdk-8-slim AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests=true

#
# Package stage
#
FROM openjdk:8-jdk-alpine
COPY --from=build /target/mycodeworks-0.0.1-SNAPSHOT.jar mycodeworks.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","mycodeworks.jar"]
