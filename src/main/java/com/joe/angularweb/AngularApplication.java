package com.joe.angularweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 180297 on 2017/12/13.
 */
@SpringBootApplication
@Controller
public class AngularApplication {
    
    @Value("${spring.title}") 
    private String title;
    
    
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("title",title);
        return mv;
    }


    public static void main(String[] args) {
        SpringApplication.run(AngularApplication.class,args);
    }

}
