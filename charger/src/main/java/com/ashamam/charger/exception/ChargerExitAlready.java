package com.ashamam.charger.exception;

public class ChargerExitAlready extends RuntimeException {
	
	private String errmsg;

	
	public ChargerExitAlready() {
	}


	public ChargerExitAlready(String errmsg) {
		this.errmsg = errmsg;
	}


	public String getErrmsg() {
		return errmsg;
	}


	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	
	
	
	

}
