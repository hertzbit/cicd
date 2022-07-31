FROM adoptopenjdk/openjdk11:latest

COPY target/*.jar cicd.jar
EXPOSE 8088
CMD ["java", "-jar", "cicd.jar"]