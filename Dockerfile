FROM openjdk:11
VOLUME /tmp
COPY target/loan-application-service-1.0-SNAPSHOT.jar loan-application-service.jar
ENTRYPOINT ["java","-jar","/loan-application-service.jar"]