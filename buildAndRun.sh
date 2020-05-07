#!/bin/sh
mvn clean package && docker build -t at.zynoz/JavaEE .
docker rm -f JavaEE || true && docker run -d -p 8080:8080 -p 4848:4848 --name JavaEE at.zynoz/JavaEE 
