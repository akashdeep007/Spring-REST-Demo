package com.demo.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.spring.errormessage.StudentErrorResponse;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleAllExceptions(Exception e) {
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.BAD_REQUEST);

	}

}
