FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER thanhtv
# WORKDIR /demo
COPY /target/*.jar /auto-deploy.jar
EXPOSE 8080
CMD ["java", "-jar" ,"/auto-deploy.jar"]
