package com.meizan.ancon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    int port;

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") int id) {

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (id == 1) return "a。其port为：" + port;
        else if (id == 2) return "b。其port为：" + port;
        else return "c。其port为：" + port;
    }
}
