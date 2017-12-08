package com.training.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.training.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
