package com.kingflyer.flightbooking.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kingflyer.flightbooking.exceptions.RecordAlreadyPresentException;
import com.kingflyer.flightbooking.exceptions.RecordNotFoundException;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public ResponseEntity<Object> RecordAlreadyPresentExceptionHandler(Exception e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.FOUND);
	}
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Object> RecordNotFoundExceptionHandler(Exception e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
