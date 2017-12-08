package com.training.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.training.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
