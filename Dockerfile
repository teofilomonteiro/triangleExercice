FROM maven:3.6.0-jdk-8-alpine

WORKDIR /usr/src/triangle

COPY . $HOME

RUN mvn clean package

FROM java:8-alpine
COPY --from=0 /usr/src/triangle/target/triangle-1.0-SNAPSHOT.jar triangle.jar
COPY scripts/run-triangle-app.sh run-triangle-app.sh

ENTRYPOINT ["./run-triangle-app.sh"]
CMD java -jar triangle.jar
