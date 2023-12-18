FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY build/libs/poll.jar .
ENTRYPOINT ["java", "-jar", "poll.jar"]

EXPOSE 8762
