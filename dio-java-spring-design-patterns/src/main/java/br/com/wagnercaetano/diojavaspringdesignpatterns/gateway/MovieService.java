package br.com.wagnercaetano.diojavaspringdesignpatterns.gateway;

import br.com.wagnercaetano.diojavaspringdesignpatterns.model.SimpleMovie;

import java.util.List;

public interface MovieService {

    List<SimpleMovie> searchMovieByName(String searchName, String apiKey);

    List<SimpleMovie> searchSavedMovies(String searchName);

    void saveMovie(SimpleMovie movie);

    void updateMovie(SimpleMovie movie);

    void deleteMovie(String movieId);


}
