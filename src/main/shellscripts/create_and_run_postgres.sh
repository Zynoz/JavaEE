#!/usr/bin/env bash
docker run --name studentapp -e POSTGRES_DB=studentapp -e POSTGRES_USER=studentapp -e POSTGRES_PASSWORD=studentapp -p 15432:5432 -d postgres:9.6.17
