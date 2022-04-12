package com.keke_land.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String main() {
        return "view/main";
    }
    @RequestMapping("/home")
    public String home() {
        return "view/main";
    }

    @RequestMapping("/board")
    public String board() {
        return "view/board";
    }
    @RequestMapping("/test1")
    public String test1() {
        return "view/test1";
    }
    @RequestMapping("/test2")
    public String test2() {
        return "view/test2";
    }



}
