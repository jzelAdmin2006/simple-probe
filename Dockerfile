# Build
FROM gradle:jdk17 AS build
WORKDIR /app
COPY . /app
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

# Runtime
FROM eclipse-temurin:17

WORKDIR /app

COPY --from=build /app/build/libs/app.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./app.jar"]
