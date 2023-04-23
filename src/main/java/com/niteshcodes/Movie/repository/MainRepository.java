package com.niteshcodes.Movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niteshcodes.Movie.entities.Movie;

@Repository
public interface MainRepository extends JpaRepository<Movie,Long> {

}
