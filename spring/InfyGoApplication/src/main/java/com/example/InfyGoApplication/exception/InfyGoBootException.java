package com.example.InfyGoApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)//404 error
public class InfyGoBootException extends RuntimeException{

	public InfyGoBootException(String message) {
		super(message);
	}

}
