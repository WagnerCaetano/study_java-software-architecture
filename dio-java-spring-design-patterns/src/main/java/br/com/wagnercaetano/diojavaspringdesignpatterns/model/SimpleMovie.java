package br.com.wagnercaetano.diojavaspringdesignpatterns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SimpleMovie {

    @Id
    private String imdbID;

    private String name;

    private String year;

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
