package com.ashamam.phone.service;

import java.util.List;

import com.ashamam.phone.dto.PhoneDto;

public interface PhoneService {

	
	public Boolean saveAll(PhoneDto dto);
	
	public PhoneDto findById(Integer id);
	
	public List<PhoneDto> readAll();
	
	public Boolean removeById(Integer id);
}
