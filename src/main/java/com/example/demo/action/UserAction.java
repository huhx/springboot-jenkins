package com.example.demo.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user: huhx
 * date: 2018/10/11 5:33 PM
 **/

@RestController
public class UserAction {

    @GetMapping("/world")
    public String world() {
        return "Hello Docker World";
    }
}
