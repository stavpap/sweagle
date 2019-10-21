package com.syntax.sweagleapi.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.syntax.sweagleapi.exceptions.NoResourceFoundException;
import com.syntax.sweagleapi.exceptions.NotValidDataException;

/**
 * A global error handling component.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = {NoResourceFoundException.class})
	public ResponseEntity<String> handleNoResource(Exception ex, WebRequest request) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {NotValidDataException.class})
	public ResponseEntity<String> handleNotValidData(Exception ex, WebRequest request) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
