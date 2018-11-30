#!/bin/sh

if [ $# -eq 3 ]
then
    java -jar triangle.jar $1 $2 $3
    exit $?
fi

java -jar triangle.jar
