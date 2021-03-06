package com.training.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.eventmanagement.controllers.exception.AlreadyCheckedInException;
import com.training.eventmanagement.entities.Participant;
import com.training.eventmanagement.repository.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class ParticipantCheckedInController {

	@Autowired
	ParticipantRepository participantRepository;
	
	
	@PostMapping("/checkedin/{id}")
	public ResponseEntity<PersistentEntityResource> checkedIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler){
		
		Participant participant = participantRepository.findOne(id);
		
		if(participant!=null) {
			if(participant.getCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
			
			participant.setCheckedIn(true);
			participantRepository.save(participant);

		}
		
		return ResponseEntity.ok(assembler.toResource(participant));
	}
}
