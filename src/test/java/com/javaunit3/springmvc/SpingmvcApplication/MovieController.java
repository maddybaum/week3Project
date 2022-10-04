package com.javaunit3.springmvc.SpingmvcApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MovieController {
    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }


        @RequestMapping("/bestMovie")
        public String getBestMovie(Model model){
        model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());

    }
}
