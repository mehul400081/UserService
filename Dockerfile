FROM openjdk:11
COPY /home/runner/work/UserService/UserService/target/user-0.0.1-SNAPSHOT.jar user.jar
ENTRYPOINT ["java","-jar","/user.jar"]
