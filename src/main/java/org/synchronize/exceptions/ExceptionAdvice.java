package org.synchronize.exceptions;

import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(NotFoundException e) {
		CustomErrorResponse error = new CustomErrorResponse("NOT_FOUND_ERROR", e.getMessage());
		error.setTimestamp(LocalDateTime.now());
		error.setStatus((HttpStatus.NOT_FOUND.value()));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}	
        
        
        @ExceptionHandler(value = ConstraintViolationException.class)
	public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(ConstraintViolationException e) {
		CustomErrorResponse error = new CustomErrorResponse("CONSTRAINT_VIOLATION", e.getMessage());
		error.setTimestamp(LocalDateTime.now());
		error.setStatus((HttpStatus.NOT_FOUND.value()));
		return new ResponseEntity<>(error, HttpStatus.SERVICE_UNAVAILABLE);
	}	
        
        
        

}
//@ExceptionHandler(value = CustomerNotFoundException.class)
//@ResponseBody
//public ResponseEntity<?> handleGenericNotFoundException(CustomerNotFoundException e) {
//	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//}