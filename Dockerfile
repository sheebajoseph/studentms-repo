FROM adoptopenjdk/maven-openjdk11

COPY target/student-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9191:9191

RUN apt-get update
RUN apt-get install -y gcc
RUN apt-get install -y curl

ENTRYPOIT ["java","-jar","app.jar"]