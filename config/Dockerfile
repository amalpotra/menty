FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY build/libs/config.jar .
ENTRYPOINT ["java", "-jar", "config.jar"]

HEALTHCHECK --interval=10s CMD wget -q --spider http://localhost:8888/actuator/health || exit 1

EXPOSE 8888
