#!/bin/bash
./mvnw package -Pnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.native -t afs/archmonth-cache .
docker tag afs/archmonth-cache registry.heroku.com/archmonth-cache/web
docker push registry.heroku.com/archmonth-cache/web
heroku container:release web -a archmonth-cache