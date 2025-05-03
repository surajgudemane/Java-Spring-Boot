package com.ashamam.mart.exception;

public class MartExistAlready extends RuntimeException {
	
	private String errmsg;

	
	public MartExistAlready() {
	}


	public MartExistAlready(String errmsg) {
		this.errmsg = errmsg;
	}


	public String getErrmsg() {
		return errmsg;
	}


	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	
	
	
	

}
