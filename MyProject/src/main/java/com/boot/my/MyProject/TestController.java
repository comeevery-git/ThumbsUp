package com.boot.my.MyProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
 
    @GetMapping("/test")
    public String getUser(Model model) {
        User user = new User("kkaok", "테스트", "web") ;
        model.addAttribute("user", user);
        return "test";
    }
    
    
    @GetMapping("/index")
    public String index(Model model) {

    	return "index";
    }
    
}
