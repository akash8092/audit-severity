FROM 370455269849.dkr.ecr.us-west-2.amazonaws.com/openjdk8-jre:latest
COPY target/Audit-Severity*.jar Audit-Severity.jar
EXPOSE 9093
ENTRYPOINT ["java","-jar","Audit-Severity.jar"]
