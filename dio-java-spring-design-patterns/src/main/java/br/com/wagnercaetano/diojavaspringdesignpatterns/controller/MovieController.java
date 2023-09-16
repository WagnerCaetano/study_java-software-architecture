package br.com.wagnercaetano.diojavaspringdesignpatterns.controller;

import br.com.wagnercaetano.diojavaspringdesignpatterns.gateway.MovieService;
import br.com.wagnercaetano.diojavaspringdesignpatterns.gateway.OmdbApiService;
import br.com.wagnercaetano.diojavaspringdesignpatterns.model.SimpleMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<SimpleMovie>> searchByName(@RequestParam(required = true) String name, @RequestParam(required = true) String apiKey) {
        return ResponseEntity.ok(movieService.searchMovieByName(name, apiKey));
    }

    @GetMapping
    public ResponseEntity<List<SimpleMovie>> search(@RequestParam(required = false) String name) {
        return ResponseEntity.ok(movieService.searchSavedMovies(name));
    }

    @PostMapping
    public ResponseEntity<SimpleMovie> insert(@RequestBody(required = true) SimpleMovie simpleMovie) {
        movieService.saveMovie(simpleMovie);
        return ResponseEntity.ok(simpleMovie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SimpleMovie> update(@RequestBody(required = true) SimpleMovie simpleMovie) {
        movieService.updateMovie(simpleMovie);
        return ResponseEntity.ok(simpleMovie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }
}
