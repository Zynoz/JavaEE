FROM airhacks/glassfish
COPY ./target/JavaEE-0.1.0-SNAPSHOT.war ${DEPLOYMENT_DIR}
