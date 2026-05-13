FROM registry.access.redhat.com/ubi9/openjdk-21

COPY target/task-tracker-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]