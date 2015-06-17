package com.zhuc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}