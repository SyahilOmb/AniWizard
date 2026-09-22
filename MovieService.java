package com.movie.moviereview;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository MovieRepo;
    public List<Movie> AllMovies(){

      return MovieRepo.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        return MovieRepo.findMovieByImdbId(imdbId);
    }
}
