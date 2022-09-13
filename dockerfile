FROM azul/zulu-openjdk-alpine:11
EXPOSE 8081
MAINTAINER https://hub.docker.com
ADD target/petclinic-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]