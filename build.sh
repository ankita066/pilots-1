#!/bin/bash

export CLASSPATH=./classes:$CLASSPATH 
DIST=./classes
VERSION=0.31

echo "PILOTS Build Script (v$VERSION)"
echo "Please make sure the current directory is in your CLASSPATH"
echo ""

if [ -d $DIST ]; then
		rm -rf $DIST
fi
echo "Making dir: "$DIST
mkdir $DIST

echo "package pilots;" > ./pilots/Version.java
echo "public class Version { public static final String ver = \"$VERSION\"; }" >> ./pilots/Version.java

echo "Compiling pilots..."
javac -Xlint:none -d $DIST `find . -name "*.java" | egrep -v 'test|example'`
# 

echo "Generating jar file..."
cd $DIST
jar cf ../lib/pilots.jar `find . -name "*.class"`
cd ..

echo "Finished!"

