package com.atguigu.gulimall.pms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldService {
    @GetMapping("/world")
    public String world() {

        String msg = "world";

        return msg;
    }
}
