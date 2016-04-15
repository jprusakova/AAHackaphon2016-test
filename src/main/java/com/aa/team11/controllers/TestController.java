package com.aa.team11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jordanculver on 4/15/16.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/droneAttack", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "You have reached a drone!";
    }
}
