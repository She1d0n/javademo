package com.joe.angularweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/**
 * Created by 180297 on 2017/12/13.
 */
@SpringBootApplication
@Controller
public class AngularApplication {
    
    @Value("${spring.title}") 
    private String title;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title",title);
        return "home.ftl";
    }


    public static void main(String[] args) {
        SpringApplication.run(AngularApplication.class,args);
    }

}
