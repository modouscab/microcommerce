FROM openjdk:8-jre-alpine
#FROM openjdk:13-alpine
VOLUME /tmp

# Download dockerize and cache that layer
ARG DOCKERIZE_VERSION
#RUN wget -O dockerize.tar.gz https://github.com/jwilder/dockerize/releases/download/${DOCKERIZE_VERSION}/dockerize-alpine-linux-amd64-${DOCKERIZE_VERSION}.tar.gz
RUN wget -O dockerize.tar.gz https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-alpine-linux-amd64-v0.6.1.tar.gz
RUN tar xzf dockerize.tar.gz
RUN chmod +x dockerize

# This is the first layer that won't be cached
ARG ARTIFACT_NAME
#ADD ${ARTIFACT_NAME}.jar /app
ADD target/microcommerce-0.0.3-SNAPSHOT.jar /app.jar

ARG EXPOSED_PORT
EXPOSE 8080

ENV SPRING_PROFILES_ACTIVE docker

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]