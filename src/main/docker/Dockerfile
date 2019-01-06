FROM java:8-alpine
VOLUME /tmp
ADD common-center.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]