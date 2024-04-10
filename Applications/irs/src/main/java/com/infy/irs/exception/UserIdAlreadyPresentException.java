package com.infy.irs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)//404 error
public class UserIdAlreadyPresentException extends InfyGoBootException {
	private static final long serialVersionUID = 1L;
	public UserIdAlreadyPresentException(String message) {
		super(message);
	}

}
