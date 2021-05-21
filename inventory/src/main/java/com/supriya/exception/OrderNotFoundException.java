package com.supriya.exception;

public class OrderNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4834986378125067347L;

	public OrderNotFoundException() {
		super();
	}

	public OrderNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public OrderNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public OrderNotFoundException(String arg0) {
		super(arg0);
	}

	public OrderNotFoundException(Throwable arg0) {
		super(arg0);
	}
	
	
	

}
