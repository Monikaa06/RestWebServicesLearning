package com.rws.application.exception;

public class CardNotFoundException extends RuntimeException {
	/**
	 * Serialized uid
	 */
	private static final long serialVersionUID = -7779496352117896217L;

	public CardNotFoundException(String message) {
		super(message);
	}
}
