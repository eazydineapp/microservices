package com.eazydineapp.menu.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity(name = "Tables")
public class Table {

    @Id
    @GeneratedValue
    private Long id;


    private Integer number;
    private String description;
    private Integer chairs;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getChairs() {
        return chairs;
    }
    public void setChairs(Integer chairs) {
        this.chairs = chairs;
    }
}

