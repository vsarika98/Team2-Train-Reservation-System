FROM openjdk:11
COPY ./build/libs/TrainTicketReservationSystem-0.0.1-SNAPSHOT.jar TrainTicketReservationSystem-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","TrainTicketReservationSystem-0.0.1-SNAPSHOT.jar"]
