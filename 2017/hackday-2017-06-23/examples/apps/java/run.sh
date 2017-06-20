#!/usr/bin/env bash

echo "Building application"
mvn clean compile assembly:single

echo "Executing application"
java -jar target/java-client-graphdb-1.0-SNAPSHOT-jar-with-dependencies.jar
