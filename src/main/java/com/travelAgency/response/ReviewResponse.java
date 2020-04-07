package com.travelAgency.response;

import com.travelAgency.model.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReviewResponse {
    private String name;
    private String comment;
    private String source;
    private Integer rating;

    public static ReviewResponse create(Review review){
        return ReviewResponse.builder()
                .name(review.getName())
                .comment(review.getComment())
                .source(review.getSource())
                .rating(review.getRating())
                .build();
    }
}
