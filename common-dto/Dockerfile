FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /common-service.jar
ENTRYPOINT ["java","-jar","/common-service.jar"]