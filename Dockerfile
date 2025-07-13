FROM eclipse-temurin:17-jdk-alpine
LABEL authors="bital"

WORKDIR /build/demo

COPY . /build/demo

ADD build.gradle.kts /build/demo
RUN gradle build -x test --parallel --continue > /dev/null 2>&1 || true

RUN ls -al ./gradlew

RUN ./gradlew build

RUN ls -al /build/demo/build/libs/demo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/build/demo/build/libs/demo.jar"]
