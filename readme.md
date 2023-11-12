# SpringBoot3.0系のお試し

## SDKサンプル

sdk use java 17.0.5-amzn

## ビルド
mvn package

## 実行
java -jar target/demo30-0.0.1-SNAPSHOT.jar

## 打鍵
curl localhost:8080/api/v1/book

### Apache Benchでの打鍵サンプル

ab -n 100 -c 100 http://localhost:8080/api/v1/book