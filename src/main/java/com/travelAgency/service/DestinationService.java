package com.travelAgency.service;

import com.travelAgency.model.Destination;
import com.travelAgency.repository.DestinationRepository;
import com.travelAgency.response.DestinationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<DestinationResponse> getTopDestinations(Integer pageNo, Integer pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("visited"));

        Page<Destination> pagedResult = destinationRepository.findAll(paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent().stream()
                    .map(destination -> DestinationResponse.create(destination))
                    .collect(Collectors.toList());
        }else{
            return new ArrayList<DestinationResponse>();
        }
    }
}
