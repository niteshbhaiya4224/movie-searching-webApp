package com.niteshcodes.Movie.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niteshcodes.Movie.services.MovieService;

@Controller
public class MainController {
    @Autowired
    MovieService movieService;
    
    @GetMapping("/")
    public String homeController(){
        return "moviedetails";
    }

    @GetMapping("/search")
    public String getMovieByName(@RequestParam(name="title") String title, Model model) throws IOException {
        model.addAttribute("movies", movieService.getMovieByName(title));
        return "moviedetails";
    }
}
