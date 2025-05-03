package com.asham.movies.service;

import java.util.List;

import com.asham.movies.dto.MoviesDto;

public interface MoviesService {

	public String saveData(MoviesDto dto);
	
	public MoviesDto findById(Integer id);
	
	public List<MoviesDto> showAll();
	
	public String deleteById(Integer id);
	
}
