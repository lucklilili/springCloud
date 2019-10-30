FROM hub.c.163.com/library/java:8-alpine
VOLUME /tmp
ADD ace-eureka.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


