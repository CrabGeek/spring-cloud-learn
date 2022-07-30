package com.crabgeek.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "MICROSERVICECLOUDPROVIDERDEPT")
public interface DeptFeignService {
}
