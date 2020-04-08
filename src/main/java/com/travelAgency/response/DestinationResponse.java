package com.travelAgency.response;

import com.travelAgency.model.Destination;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class DestinationResponse{

    private String name;
    private String duration;
    private String description;
    private String image;
    private Long price;
    private Integer offer;
    private String bestTime;
    private Integer rating;
    private List<ReviewResponse> reviewList;
    private Integer visited;

    public static DestinationResponse create(Destination destination){
        return DestinationResponse.builder()
                .name(destination.getName())
                .duration(destination.getDuration())
                .description(destination.getDescription())
                .image(destination.getImage())
                .price(destination.getPrice())
                .offer(destination.getOffer())
                .bestTime(destination.getBestTime())
                .rating(destination.getRating())
                .reviewList(destination.getReviews().stream().map(d->ReviewResponse.create(d)).collect(Collectors.toList()))
                .visited(destination.getVisited())
                .build();
    }
}
