# archmonth-cache

This project example to explain about cache, in the event `Arch Month DB1`

This check work heroku application
https://archmonth-cache.herokuapp.com/

Only in the first call not used cache
https://archmonth-cache.herokuapp.com/cache?key=abc

Not used cache in the all requests
https://archmonth-cache.herokuapp.com/no-cache?key=abc


## Running the application in dev mode
You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Creating a native executable
You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/archmonth-cache-1.0.0-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

# Command Mode
Guide: https://quarkus.io/guides/command-mode-reference
