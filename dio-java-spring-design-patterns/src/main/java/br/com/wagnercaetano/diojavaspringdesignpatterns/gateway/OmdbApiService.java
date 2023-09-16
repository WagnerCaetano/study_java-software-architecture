package br.com.wagnercaetano.diojavaspringdesignpatterns.gateway;

import br.com.wagnercaetano.diojavaspringdesignpatterns.model.SimpleMovie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "omdbapi", url = "https://www.omdbapi.com")
public interface OmdbApiService {

    @GetMapping
    List<SimpleMovie> searchMovie(@RequestParam("s") String searchName, @RequestParam("apikey") String apiKey);
}
