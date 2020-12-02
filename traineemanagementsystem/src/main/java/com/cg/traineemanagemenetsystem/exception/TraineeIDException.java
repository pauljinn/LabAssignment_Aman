package com.cg.traineemanagemenetsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TraineeIDException extends RuntimeException {
	
	public TraineeIDException() {
		super();
	}
	
	public TraineeIDException(String errMsg) {
		super(errMsg);
	}

}
