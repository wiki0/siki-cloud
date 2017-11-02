FROM java.slim
VOLUME /tmp
ADD ./target/eureka-server-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'

EXPOSE 1100

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]