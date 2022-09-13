FROM azul/zulu-openjdk-alpine:11
EXPOSE 8081
MAINTAINER https://hub.docker.com
ADD target/petclinic-0.0.1-SNAPSHOT.jar petclinic-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/petclinic-0.0.1-SNAPSHOT.jar"]