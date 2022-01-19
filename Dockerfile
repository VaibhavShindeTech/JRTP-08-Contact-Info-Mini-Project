FROM java:8-jdk-alpine

MAINTAINER vaibhav shinde "vaibhavshinde1642@gmail.com"

COPY ./target/ContactApp.war /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch ContactApp.war'

ENTRYPOINT ["java","-jar","ContactApp.war"]