# syntax=docker/dockerfile:1

FROM azul/zulu-openjdk:11

COPY ./target /usr/local/SimpleApp

ENTRYPOINT ["java","-jar", "/usr/local/SimpleApp/SimpleApp-1.0.0.jar"]