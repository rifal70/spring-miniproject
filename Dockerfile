# Dockerfile
FROM openjdk:17
ADD target/miniproject-0.0.1-SNAPSHOT.jar miniproject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "miniproject-0.0.1-SNAPSHOT.jar"]