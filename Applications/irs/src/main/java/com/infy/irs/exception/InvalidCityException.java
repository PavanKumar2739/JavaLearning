package com.infy.irs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)//404 error
public class InvalidCityException extends InfyGoBootException{
	private static final long serialVersionUID = 1L;
	public InvalidCityException(String message) {
		super(message);
	}
}
