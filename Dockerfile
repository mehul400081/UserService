FROM openjdk:11
RUN mkdir target
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} target/user.jar
ENTRYPOINT ["java","-jar","/target/app.jar"]
