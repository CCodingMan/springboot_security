package com.ljj.springboot_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljj
 * @Date: 2019/7/25 17:42
 * @Description:
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
