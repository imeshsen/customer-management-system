#!/bin/bash

docker network create spring-network

docker build -t spring .
