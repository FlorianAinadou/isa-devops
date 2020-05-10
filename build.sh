#!/bin/bash

## Building the j2e system
cd j2e-entities
mvn clean install
cd ..

## Building client
cd front
mvn clean install
cd ..

cd j2e-otherComponents
mvn clean install
cd ..

cd j2e
mvn clean install
cd ..

## Building the .Net system
cd dotNet
./compile.sh
cd ..
