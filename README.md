# AWS X-Ray setup with sample Spring Boot Application using X-Ray SDK for Java with Auto-instrumentation

## Introduction

This repository contains AWS X-Ray setup with sample Spring Boot Application using X-Ray SDK for Java with
Auto-instrumentation

## Usage

1. Create `xray-daemon` service account:

```shell
eksctl utils associate-iam-oidc-provider \
  --region=eu-central-1 \
  --cluster=cluster-04 \
  --approve
```

```shell
eksctl create iamserviceaccount \
      --name xray-daemon \
      --namespace default \
      --cluster cluster-04 \
      --attach-policy-arn arn:aws:iam::aws:policy/AWSXRayDaemonWriteAccess \
      --approve \
      --override-existing-serviceaccounts
```

## Author

Dominik Cebula

* https://dominikcebula.com/
* https://blog.dominikcebula.com/
* https://www.udemy.com/user/dominik-cebula/
