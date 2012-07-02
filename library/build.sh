#!/bin/bash

rm -rf out NotificationCompat2-1.0.0.jar
mkdir out
javac -d out -cp "$ANDROID_HOME/platforms/android-16/android.jar" src/main/java/com/jakewharton/notificationcompat2/*
jar cf NotificationCompat2-1.0.0.jar out/*
rm -rf out
