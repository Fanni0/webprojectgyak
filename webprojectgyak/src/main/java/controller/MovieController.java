package controller;

import java.util.List;

import dto.MovieDTO;
import entity.MovieEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.MovieService;


@RestController
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(path = "/movies", method = RequestMethod.GET)
    public List<MovieDTO> findall() {
        List<MovieDTO> movies = movieService.findall();
        return movies;
    }

    @RequestMapping(path = "/movies/{id}", method = RequestMethod.GET)
    public MovieDTO findById(@PathVariable Long id) {
        return null;
    }
}
