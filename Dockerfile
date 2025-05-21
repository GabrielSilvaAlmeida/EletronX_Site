
FROM openjdk:17-jdk-slim


WORKDIR /eletronx


COPY target/eletronx-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app.jar"]