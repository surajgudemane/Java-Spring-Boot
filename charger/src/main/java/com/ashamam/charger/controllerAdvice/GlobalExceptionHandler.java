package com.ashamam.charger.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ashamam.charger.exception.ChargerExitAlready;
import com.ashamam.charger.exception.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ChargerExitAlready.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public @ResponseBody ErrorResponse handlerDoing(ChargerExitAlready chargerAlreadyExists)
	{
		return new ErrorResponse(HttpStatus.CONFLICT.value(),chargerAlreadyExists.getErrmsg()) ;
	}
}
