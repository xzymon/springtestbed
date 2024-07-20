FROM amazoncorretto:17-alpine-jdk

WORKDIR /app

COPY . .

RUN ./gradlew bootJar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "build/libs/springtestbed-0.0.1-SNAPSHOT.jar"]