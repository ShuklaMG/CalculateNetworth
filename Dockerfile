FROM openjdk:8
EXPOSE 8084
ADD target/CalculateNetworth-0.0.1-SNAPSHOT.jar CalculateNetworth-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CalculateNetworth-0.0.1-SNAPSHOT.jar"]