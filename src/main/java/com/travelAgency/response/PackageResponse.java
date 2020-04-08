package com.travelAgency.response;

import com.travelAgency.model.Destination;
import com.travelAgency.model.Package;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class PackageResponse {

    private String name;
    private Destination destination;
    private String description;
    private List<SiteSeeingResponse> siteSeeings;
    private Integer offer;
    private List<AmenitiesResponse> amenities;
    private String duration;
    private Long price;

    public static PackageResponse create(Package packageObj){
        return PackageResponse.builder()
                .name(packageObj.getName())
                .amenities(packageObj.getAmenities().stream()
                        .map(a->AmenitiesResponse.create(a))
                        .collect(Collectors.toList()))
                .destination(packageObj.getDestination())
                .description(packageObj.getDescription())
                .siteSeeings(packageObj.getSiteSeeings().stream()
                        .map(s->SiteSeeingResponse.create(s))
                        .collect(Collectors.toList()))
                .offer(packageObj.getOffer())
                .price(packageObj.getPrice())
                .duration(packageObj.getDuration())
                .build();
    }

}
