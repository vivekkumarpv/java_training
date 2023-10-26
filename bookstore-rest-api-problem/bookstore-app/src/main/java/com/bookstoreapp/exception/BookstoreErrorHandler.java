package com.bookstoreapp.exception;

import com.bookstoreapp.dto.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ValidationException;

@RestControllerAdvice
public class BookstoreErrorHandler {

	// create a method to handle BookNotFoundException
	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity<ErrorResponse> handleBookNotFoundException(BookNotFoundException e,
			HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		ErrorResponse body = new ErrorResponse(status.value(), e.getMessage(), System.currentTimeMillis(),"/books",
				status.getReasonPhrase());

		return ResponseEntity.status(status).body(body);
	}

	// create a method to handle BookAlreadyExistsException
	@ExceptionHandler(BookAlreadyExistsException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public ResponseEntity<ErrorResponse> handleBookAlreadyException(BookAlreadyExistsException e,
			HttpServletRequest request) {
		HttpStatus status = HttpStatus.CONFLICT;
		ErrorResponse body = new ErrorResponse(status.value(), e.getMessage(), System.currentTimeMillis(), "/books",
				status.getReasonPhrase());

		return ResponseEntity.status(status).body(body);
	}

	// create a method to validate the request body
	@ExceptionHandler(ValidationException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorResponse> handleValidationException(ValidationException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		ErrorResponse body = new ErrorResponse(status.value(), e.getMessage(), System.currentTimeMillis(), "/books",
				status.getReasonPhrase());

		return ResponseEntity.status(status).body(body);
	}

	// create a method to handle Exception
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<ErrorResponse> handleOtherException(Exception e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		ErrorResponse body = new ErrorResponse(status.value(), e.getMessage(), System.currentTimeMillis(), "/books",
				status.getReasonPhrase());

		return ResponseEntity.status(status).body(body);
	}

}
