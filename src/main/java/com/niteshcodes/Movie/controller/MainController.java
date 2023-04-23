package com.niteshcodes.Movie.controller;

import java.io.IOException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niteshcodes.Movie.entities.Movie;
import com.niteshcodes.Movie.repository.MainRepository;
import com.niteshcodes.Movie.services.MovieService;



@Controller
public class MainController {
    @Autowired
    MovieService movieService;

    @Autowired
    MainRepository mainRepository;
    
    @GetMapping("/")
    public String homeController(){
        return "moviedetails"; 
    }

    @GetMapping("/search")
    public String getMovieByName(@RequestParam(name="title") String title, Model model) throws IOException {
        Movie movie = movieService.getMovieByName(title);
        model.addAttribute("movies", movie);
        return "moviedetails";
    }

    @PostMapping("/addFav")
    public String addFavourite(){
        movieService.addFavourite();
        return "redirect:/extract";
    }

    @GetMapping("/extract")
    public String extract(Model model){
        Set<Movie> s1 = movieService.extractingUrl();
        model.addAttribute("favMovies", s1);
        return "addFav";
    }

    @PostMapping("/delete")
    public String deleteMovie(@RequestParam("movieId") Long movieId) {
    mainRepository.deleteById(movieId);
    return "addFav";
}

}
