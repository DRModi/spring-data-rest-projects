package com.training.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.training.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
