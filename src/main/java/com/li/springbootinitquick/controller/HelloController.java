package com.li.springbootinitquick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody//这个类的所有方法返回的数据全部直接写给浏览器，对象写成json数据；
//@Controller
@RestController//代替上面的两个注解，这个rest风格的注解
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
