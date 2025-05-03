package com.ashamam.phone.exception;

@SuppressWarnings("serial")
public class ExceptionInService extends RuntimeException{

	private String errorMsg;

	public ExceptionInService(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public ExceptionInService() {
		super();
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

//	@Override
//	public String toString() {
//		return "Problem in Service";
//	}
	
	
}
