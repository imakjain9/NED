package com.travelAgency.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;

    private String name;
    private String duration;
    private String description;
    private String image;
    private Long price;
    private String bestTime;
    private Integer offer;
    private Integer visited;
    private Integer rating;

    @OneToMany(mappedBy = "destination")
    private List<Review> reviews;

}
