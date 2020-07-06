FROM openjdk:8
COPY target/spring-cloud-kubernetes-config-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
# Make port 8080 available to the world outside this container
#EXPOSE 8080
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]