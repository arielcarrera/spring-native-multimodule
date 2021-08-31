#!/bin/sh

mvn clean package spring-boot:build-image -Pnative
