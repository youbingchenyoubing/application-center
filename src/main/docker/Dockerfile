FROM java:8-alpine
VOLUME /tmp
ADD common-center.jar /app.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=${SPRING_PROFILE_ACTIVE}","-jar","/app.jar"]
