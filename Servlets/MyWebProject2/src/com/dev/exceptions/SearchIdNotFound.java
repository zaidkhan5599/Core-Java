package com.dev.exceptions;

public class SearchIdNotFound extends RuntimeException{

	@Override
	public String getMessage() {
		
		return "Searching failed as element not found";
	}

}
