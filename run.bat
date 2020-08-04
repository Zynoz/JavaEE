mvn clean package && docker build -t at.zynoz/javaee .
docker run -p 8181:8080 -p 4848:4848 --name javaee at.zynoz/javaee
