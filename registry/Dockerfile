FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY build/libs/registry.jar .
ENTRYPOINT ["java", "-jar", "registry.jar"]

HEALTHCHECK --interval=10s CMD wget -q --spider http://localhost:8761/actuator/health || exit 1

EXPOSE 8761
