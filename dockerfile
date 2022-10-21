FROM openjdk:17-jdk-alpine

COPY target/DemoGK-0.0.1-SNAPSHOT.jar DemoGK-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar", "/DemoGK-0.0.1-SNAPSHOT.jar"]