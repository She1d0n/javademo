package com.joe.angularweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 180297 on 2017/12/13.
 */
@SpringBootApplication
@Controller
public class AngularApplication {

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("home");
    }


    public static void main(String[] args) {
        SpringApplication.run(AngularApplication.class,args);
    }

}
