package com.ashamam.phone.exception;

@SuppressWarnings("serial")
public class ExceptionInController extends RuntimeException{

	private String errorMsg;

	public ExceptionInController(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public ExceptionInController() {
		super();
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "Excepttion in Controller";
	}
	
	
}
