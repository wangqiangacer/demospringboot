package com.example.demospringboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @CreateTime: 2019-01-15 15:04
 * @Description: ${Description}
 */
@RestController
public class Controller {
    @RequestMapping("/user")
    public  String info(){
        return "hello world";
    }
}
