package com.test.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        if (1 == 1) {
            throw new RuntimeException("我错了，我真的错了");
        }

        return "21324324234";
    }

}
