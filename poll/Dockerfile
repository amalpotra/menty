FROM eclipse-temurin:17-jre-alpine
LABEL author="Amarjeet Malpotra"

WORKDIR /app
COPY build/libs/poll.jar .
ENTRYPOINT ["java", "-jar", "poll.jar"]

EXPOSE 8080
