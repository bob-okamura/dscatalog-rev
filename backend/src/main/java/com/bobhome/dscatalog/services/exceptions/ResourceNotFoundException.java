package com.bobhome.dscatalog.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Long id) {
		super("Id "+ id + " not found!");
	}

}
