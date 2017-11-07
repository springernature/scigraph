#!/usr/bin/env bash

set -e

mvn clean compile assembly:single

java -jar target/java-client-graphdb-1.0-SNAPSHOT-jar-with-dependencies.jar
