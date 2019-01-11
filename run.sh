#!/bin/bash
docker run -p 8761:8761 -d -e SPRING_PROFILE_ACTIVE="dev"  registry.cn-hangzhou.aliyuncs.com/just-do-it/common-center:1.0.0