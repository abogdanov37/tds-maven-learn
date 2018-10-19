FROM java:8u111
MAINTAINER Andrew Bogdanov

ADD target/tds-maven-learn-1.0-SNAPSHOT.jar /bin/tds-maven-learn.jar

EXPOSE 8085

CMD ["/usr/bin/java", "-jar",  "/bin/tds-maven-learn.jar"]