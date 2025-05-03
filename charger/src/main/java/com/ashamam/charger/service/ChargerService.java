package com.ashamam.charger.service;

import java.util.List;

import com.ashamam.charger.dto.ChargerDto;

public interface ChargerService {

	public String create(ChargerDto dto);
	
	public ChargerDto findById(Integer id);
	
	public List<ChargerDto> readAll();
	
	public String deleteById(Integer id);
	
}
