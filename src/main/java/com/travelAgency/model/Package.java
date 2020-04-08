package com.travelAgency.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;
    private Destination destination;
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "package-siteSeeing",
            joinColumns = { @JoinColumn(name = "package_id") },
            inverseJoinColumns = { @JoinColumn(name = "siteSeeing_id") })
    private List<SiteSeeing> siteSeeings;
    private Integer offer;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "package-amenities",
            joinColumns = { @JoinColumn(name = "package_id") },
            inverseJoinColumns = { @JoinColumn(name = "amenities_id") })
    private List<Amenities> amenities;
    private String duration;
    private Long price;
}
