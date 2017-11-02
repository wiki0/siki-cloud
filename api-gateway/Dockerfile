FROM wiki0/java
VOLUME /tmp
ADD ./target/api-gateway-1.0.0.jar api.jar
#RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]

EXPOSE 8080