package com.meizan.ancon.service;

import org.springframework.stereotype.Component;

@Component
public class MyFallback implements FeignService {

    @Override
    public String getUser(int id) {
        return "error getUser";
    }
}
