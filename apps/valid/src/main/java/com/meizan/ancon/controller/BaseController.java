package com.meizan.ancon.controller;

import com.meizan.ancon.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BaseController {

    @Resource
    private FeignService feignService;

    @GetMapping("/feign")
    public String index(String name, int id) {

        String result = feignService.getUser(id);

        return "商品：" + name + ",订单：" + result;
    }
}
