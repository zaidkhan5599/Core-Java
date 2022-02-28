package com.dev.exceptions;

public class CreateException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Creation operation failed";
	}

}
