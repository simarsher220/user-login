FROM openjdk:10-jre-slim

LABEL Name="User Login Service" \
            Product="Test Deployment"

EXPOSE 9090

RUN mkdir /container
COPY build/libs/user-login-0.0.1-SNAPSHOT.jar /container/user-login.jar

WORKDIR /container

ENTRYPOINT exec java $JAVA_OPTS -jar sample-project.jar