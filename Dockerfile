FROM openjdk:8-jdk-alpine
COPY ./target/dockerTest.jar /app/dockerTest.jar
WORKDIR /app
CMD ["java", "-jar", "dockerTest.jar"]