FROM eclipse-temurin:17-jre-alpine

WORKDIR /app
COPY build/libs/discovery.jar .
ENTRYPOINT ["java", "-jar", "discovery.jar"]

EXPOSE 8761
