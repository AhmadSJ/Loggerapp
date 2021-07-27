FROM openjdk:15-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} loggerapp.jar
ENTRYPOINT ["java","-jar","loggerapp.jar"]