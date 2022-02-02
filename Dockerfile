FROM openjdk:8
ADD target/RoomModule.jar RoomModule.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","RoomModule.jar"]