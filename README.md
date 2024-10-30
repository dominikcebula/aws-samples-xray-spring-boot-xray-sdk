# AWS X-Ray setup with sample Spring Boot Application using X-Ray SDK for Java

## Introduction

This repository contains AWS X-Ray setup with sample Spring Boot Application using X-Ray SDK for Java.

## Usage

1. Create EKS Cluster:

```shell
./01_create_cluster.sh
```

2. Create `xray-daemon` service account:

```shell
eksctl utils associate-iam-oidc-provider \
  --region=eu-central-1 \
  --cluster=cluster-01 \
  --approve
```

```shell
eksctl create iamserviceaccount \
      --name xray-daemon \
      --namespace default \
      --cluster cluster-01 \
      --attach-policy-arn arn:aws:iam::aws:policy/AWSXRayDaemonWriteAccess \
      --approve \
      --override-existing-serviceaccounts
```

3. Build project:

```shell
mvn clean install
```

4. Build and push docker image:

```shell
02_build_image.sh
```

```shell
03_push_image.sh
```

5. Deploy Service Account

```shell
./04_deploy_xray_serviceaccount.sh
```

6. Deploy X-ray DaemonSet

```shell
./05_deploy_xray_daemonset.sh
```

7. Deploy App

```shell
06_deploy_app.sh
```

## Author

Dominik Cebula

* https://dominikcebula.com/
* https://blog.dominikcebula.com/
* https://www.udemy.com/user/dominik-cebula/
