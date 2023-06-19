FROM eclipse-temurin:17-jre-alpine
LABEL author="Amarjeet Malpotra"

WORKDIR /app
COPY build/libs/config.jar .
ENTRYPOINT ["java", "-jar", "config.jar"]

EXPOSE 8888
