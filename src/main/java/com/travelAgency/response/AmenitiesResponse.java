package com.travelAgency.response;

import com.travelAgency.model.Amenities;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class AmenitiesResponse {
    private String name;
    private String icon;

    public static AmenitiesResponse create(Amenities amenities){
        return AmenitiesResponse.builder()
                .name(amenities.getName())
                .icon(amenities.getIcon())
                .build();
    }
}
