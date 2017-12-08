package com.training.eventmanagement.controllers.exception;

public class AlreadyCheckedInException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Participant is already checkedIn";
	}
	
	

}
