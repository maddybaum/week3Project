package com.javaunit3.springmvc;

import com.javaunit3.springmvc.BestMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller

public class MovieController {
    @Autowired
    private BestMovieService bestMovieService;
    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }


        @RequestMapping("/bestMovie")
        public String getBestMovie(Model model) {
            model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());
            return "bestMovie";
        }

        @RequestMapping("/voteForBestMovieForm")
        public String voteForBestMovieFormPage(){
            return "voteForBestMovie";
        }
        @RequestMapping("/voteForBestMovie")
        public String voteForBestMovie(HttpServletRequest request, Model model) {

        String movieTitle = request.getParameter("movieTitle");

        model.addAttribute("BestMovieVote", movieTitle);

        return "voteForBestMovie";
    }


    }

