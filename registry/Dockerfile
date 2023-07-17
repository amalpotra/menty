FROM eclipse-temurin:17-jre-alpine

WORKDIR /app
COPY build/libs/registry.jar .
ENTRYPOINT ["java", "-jar", "registry.jar"]

EXPOSE 8761
