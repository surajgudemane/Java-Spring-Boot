package com.ashamam.mart.service;

import java.util.List;

import com.ashamam.mart.dto.MartDto;

public interface MartService {
	
	public Boolean addDto(MartDto dto);
	
	public MartDto findById(Integer id);
	
	public List<MartDto> readAll();
	
	public Boolean update(MartDto dto);
	
	public Boolean deleteById(Integer id);
	
}
