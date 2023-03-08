package br.com.etec.richard.rentalAPI.controller;

import br.com.etec.richard.rentalAPI.model.Movie;
import br.com.etec.richard.rentalAPI.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> list() {
        return movieRepository.findAll();
    }

}
