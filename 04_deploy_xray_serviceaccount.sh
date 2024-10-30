#!/bin/bash

export ROLE_ARN=`eksctl get iamserviceaccount xray-daemon --cluster cluster-04 -o json |jq -r '.[0].status.roleARN'`

cat deployment/02-xray-serviceaccount.yaml |envsubst |kubectl apply -f -
