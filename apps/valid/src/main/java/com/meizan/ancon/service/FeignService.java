package com.meizan.ancon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "datacenter", fallback = MyFallback.class)
public interface FeignService {

    @GetMapping(value="/test/{id}")
    String getUser(@PathVariable("id") int id);

}
