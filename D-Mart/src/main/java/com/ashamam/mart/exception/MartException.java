package com.ashamam.mart.exception;


public class MartException {

	private Integer erroCode;
	private String errorMessage;
	
	public MartException() {

	}
	public MartException(Integer erroCode, String errorMessage) {
		super();
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
	}
	public Integer getErroCode() {
		return erroCode;
	}
	public void setErroCode(Integer erroCode) {
		this.erroCode = erroCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "MartException [erroCode=" + erroCode + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
}
