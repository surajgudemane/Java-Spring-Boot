package com.asham.watch.service;

import java.util.List;

import com.asham.watch.dto.WatchDto;

public interface WatchService {

	public String saveDto(WatchDto dto);
	
	public WatchDto findById(Integer id);
	
	public List<WatchDto> readAll();
	
	public String deleteById(Integer id);
	
}
