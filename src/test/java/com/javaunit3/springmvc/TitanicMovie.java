package com.javaunit3.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie{
    public String getTitle(){
        return "Titanic";
    }
    public String getMaturityRating(){
        return "Pg-13";
    }
    public String getGenre(){
        return "Romance";
    }
}
