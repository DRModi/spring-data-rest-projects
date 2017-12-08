package com.training.eventmanagement.entities.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.training.eventmanagement.entities.Venue;

@Projection(name = "virtul", types = { Venue.class })
public interface StreetAddressVirtualProjection {

	@Value("#{target.streetAddress}, #{target.streetAddress2}, #{target.city}, #{target.state} - #{target.postalCode}")
	String getCombinedCompleteAddress();

}
