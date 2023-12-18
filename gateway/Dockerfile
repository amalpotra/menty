FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY build/libs/gateway.jar .
ENTRYPOINT ["java", "-jar", "gateway.jar"]

EXPOSE 8760
