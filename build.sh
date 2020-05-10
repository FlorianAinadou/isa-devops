#!/bin/bash

## Building the j2e system
cd j2e-entities
mvn clean install
cd ..

cd j2e-otherComponents
mvn clean install
cd ..

cd j2e
mvn clean install
docker build -t dd-j2e .
cd ..

## Building client
cd front
mvn clean package
docker build -t dd-client .
cd ..


## Building the .Net system
cd dotNet
./compile.sh
docker build -t dd-dotnet .
cd ..

