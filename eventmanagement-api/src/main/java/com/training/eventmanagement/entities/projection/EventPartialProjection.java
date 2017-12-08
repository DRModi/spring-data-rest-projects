package com.training.eventmanagement.entities.projection;

import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.training.eventmanagement.entities.Event;

@Projection(name = "partialevents", types = {Event.class})
public interface EventPartialProjection {

	//Event Class Getters of properties.
	String getName();
	ZonedDateTime getStartTime();
	ZonedDateTime getEndTime();
	
	
	//JsonIgnore in parent class 
	Instant getCreated();
}
