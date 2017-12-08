package com.training.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.eventmanagement.entities.Event;
import com.training.eventmanagement.repository.EventRepository;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

	@Autowired
	EventRepository eventRepository;

	@PostMapping("/startevent/{id}")
	public ResponseEntity startEvent(@PathVariable Long id) {
		Event startEvent = eventRepository.findOne(id);

		if (startEvent == null) {
			throw new ResourceNotFoundException();
		}
		

		startEvent.setStarted(true);
		eventRepository.save(startEvent);
		return ResponseEntity.ok("Event called ==> " + startEvent.getName() + " - is Started");
	}
	
}
