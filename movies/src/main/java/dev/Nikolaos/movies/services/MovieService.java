package dev.Nikolaos.movies.services;

import dev.Nikolaos.movies.entities.Movie;
import dev.Nikolaos.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    //Method for return all movies from db
    public List<Movie> AllMovies(){
        return movieRepository.findAll();
    }

    //Method for return a movie by imdbId
    public Optional<Movie> MovieById(String imdbId){
       return movieRepository.getMovieByImdbId(imdbId);
    }
}
