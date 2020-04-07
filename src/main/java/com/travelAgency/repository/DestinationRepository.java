package com.travelAgency.repository;

import com.travelAgency.model.Destination;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends PagingAndSortingRepository<Destination, Long> {
}
