FROM airhacks/glassfish
COPY ./target/JavaEE.war ${DEPLOYMENT_DIR}
