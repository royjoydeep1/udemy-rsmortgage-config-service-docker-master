FROM openjdk

VOLUME /tmp
ADD maven/udemy-rsmortgage-config-service-docker-0.0.1-SNAPSHOT.jar udemy-rsmortgage-config-service-docker-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /udemy-rsmortgage-config-service-docker-0.0.1-SNAPSHOT'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/udemy-rsmortgage-config-service-docker-0.0.1-SNAPSHOT.jar"]