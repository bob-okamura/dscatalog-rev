package com.bobhome.dscatalog.services.exceptions;

public class DatabaseException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(Long id) {
		super("Integrity Violation. ID " + id + " cannot be deleted!");
	}

}
