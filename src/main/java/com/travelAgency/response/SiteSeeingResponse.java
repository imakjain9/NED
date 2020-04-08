package com.travelAgency.response;

import com.travelAgency.model.SiteSeeing;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SiteSeeingResponse {

    private String name;

    public static SiteSeeingResponse create(SiteSeeing siteSeeing){
        return SiteSeeingResponse.builder()
                .name(siteSeeing.getName())
                .build();
    }
}
