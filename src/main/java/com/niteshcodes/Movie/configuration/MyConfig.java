package com.niteshcodes.Movie.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.niteshcodes.Movie.repository")
public class MyConfig {
   
}
