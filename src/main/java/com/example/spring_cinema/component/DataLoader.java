package com.example.spring_cinema.component;

import com.example.spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieService moviesService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
