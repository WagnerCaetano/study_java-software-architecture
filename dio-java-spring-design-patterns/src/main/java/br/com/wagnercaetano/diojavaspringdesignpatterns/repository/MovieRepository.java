package br.com.wagnercaetano.diojavaspringdesignpatterns.repository;

import br.com.wagnercaetano.diojavaspringdesignpatterns.model.SimpleMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<SimpleMovie, String> {

    // implement find by name
    List<SimpleMovie> findByName(String name);

}
