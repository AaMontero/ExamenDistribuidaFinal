FROM eclipse-temurin:17.0.7_7-jre-alpine

RUN mkdir /app
WORKDIR /app

COPY build/libs/ books-1.0.0-SNAPSHOT.jar

CMD ["java","-jar","app.jar"]

