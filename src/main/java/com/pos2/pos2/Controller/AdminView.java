package com.pos2.pos2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminView {

    @GetMapping("/admin")
    public String home (){
        return "admin";
    }

}
