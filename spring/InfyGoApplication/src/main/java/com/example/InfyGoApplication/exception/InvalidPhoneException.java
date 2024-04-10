package com.example.InfyGoApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)//404 error
public class InvalidPhoneException extends InfyGoBootException{
	private static final long serialVersionUID = 1L;
	public InvalidPhoneException(String message) {
		super(message);
	}
}
