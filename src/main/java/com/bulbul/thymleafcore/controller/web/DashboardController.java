package com.bulbul.thymleafcore.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public String dashboard() {
        return "pages/dashboard";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String dashboard2() {
        return "login";
    }
}
