package com.ashamam.pan.service;

import java.util.List;

import com.ashamam.pan.dto.PanDto;

public interface PanCardService {

	public Boolean SavePanCard(PanDto dto);
	
	public PanDto findPanById(Integer id);
	
	public List<PanDto> readAll();
	
	public Boolean updatePanDto(PanDto dto);
	
	public Boolean deletePanById(Integer id);
	
}
