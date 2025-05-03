package com.ashamam.mart.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ashamam.mart.exception.MartException;
import com.ashamam.mart.exception.MartExistAlready;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = MartExistAlready.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public @ResponseBody MartException handlerDoing(MartExistAlready cx)
	{
		return new MartException(HttpStatus.CONFLICT.value(),cx.getErrmsg()) ;
	}
}
