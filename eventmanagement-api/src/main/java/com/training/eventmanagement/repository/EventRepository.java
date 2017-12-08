package com.training.eventmanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.eventmanagement.entities.Event;
import com.training.eventmanagement.entities.projection.EventPartialProjection;


@RepositoryRestResource(excerptProjection=EventPartialProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
	
	//List<Event> findByName(@Param("name")  String name);
	Page<Event> findByName(@Param("name")  String name, Pageable pageable);
	
	Page<Event> findByNameAndZoneId(@Param("name")  String name, @Param("zoneId")  String zoneid , Pageable pageable);

}
