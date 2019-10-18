FROM java:8
WORKDIR /
ADD target/studentTest-0.0.1-SNAPSHOT.jar studentTest-0.0.1-SNAPSHOT.jar
CMD java -jar studentTest-0.0.1-SNAPSHOT.jar

