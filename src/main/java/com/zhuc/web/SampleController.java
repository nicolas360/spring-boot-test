package com.zhuc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 因为MyTask.java类存在死循环，所以要想使该controller起作用，需注释部分代码。
 */
@Controller
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}