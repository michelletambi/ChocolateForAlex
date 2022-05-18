package com.bnta.chocolate.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    private String country;
    @JsonIgnoreProperties({"estate"})
//  *One* estate can have *chocolates* e.g. One cocoa farm will produce many chocolates
    /* Relationship from this perspective is @OneToMany.
    mappedBy = ? where ? indicates the inverse of this relationship.

     */
    @OneToMany (mappedBy = "estate", cascade = CascadeType.ALL)
    private List<Chocolate> chocolates;


    public Estate(String name, String country) {
        this.name = name;
        this.country = country;
        this.chocolates = new ArrayList<Chocolate>();
    }

    public Estate() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chocolate> getChocolates() {
        return chocolates;
    }

    public void setChocolates(List<Chocolate> chocolates) {
        this.chocolates = chocolates;
    }
}
