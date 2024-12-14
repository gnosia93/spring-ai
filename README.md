### 설정 ###

[build.gradle]
```
implementation 'org.springframework.boot:spring-boot-starter-actuator'
implementation 'io.micrometer:micrometer-registry-prometheus:latest.release'
```

[application.yaml]
```
# Spring Boot 액추에이터의 웹 엔드포인트 중 어떤 것들을 노출할 것인지 지정
management:
  endpoints:
    web:
      exposure:
        include: '*'
  metrics:
    #   Micrometer를 통해 수집된 Metric 데이터를 Prometheus 형식으로 노출할지 여부를 결정
    export:
      prometheus:
        enabled: true
    #   HTTP 요청의 처리 시간을 자동으로 측정하여 Metric으로 수집하도록 지정
    web:
      server:
        auto-time-requests: true
```

### 엔드포인트 ###
```
http://127.0.0.1:8080/actuator
http://127.0.0.1:8080/actuator/metrics
http://127.0.0.1:8080/actuator/prometheus
```











* [Spring Boot에서 metric을 적용하자!](https://velog.io/@limsubin/Spring-Boot%EC%97%90%EC%84%9C-metric%EC%9D%84-%EC%A0%81%EC%9A%A9%ED%95%98%EC%9E%90)
