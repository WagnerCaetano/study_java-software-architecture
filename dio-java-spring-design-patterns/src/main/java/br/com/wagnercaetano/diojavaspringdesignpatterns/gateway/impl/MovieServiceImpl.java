package br.com.wagnercaetano.diojavaspringdesignpatterns.gateway.impl;

import br.com.wagnercaetano.diojavaspringdesignpatterns.gateway.MovieService;
import br.com.wagnercaetano.diojavaspringdesignpatterns.gateway.OmdbApiService;
import br.com.wagnercaetano.diojavaspringdesignpatterns.model.SimpleMovie;
import br.com.wagnercaetano.diojavaspringdesignpatterns.repository.MovieRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private OmdbApiService omdbApiService;

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<SimpleMovie> searchMovieByName(String searchName, String apiKey) {
        return omdbApiService.searchMovie(searchName, apiKey);
    }

    @Override
    public List<SimpleMovie> searchSavedMovies(String searchName) {
        return Strings.isBlank(searchName) ?
                StreamSupport.stream(movieRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList()) :
                movieRepository.findByName(searchName);
    }

    @Override
    public void saveMovie(SimpleMovie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void updateMovie(SimpleMovie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(String movieId) {
        movieRepository.deleteById(movieId);
    }
}
