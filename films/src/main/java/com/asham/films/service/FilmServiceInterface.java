package com.asham.films.service;

import java.util.List;

import com.asham.films.dto.FilmsDto;

public interface FilmServiceInterface {

	public String save(FilmsDto dto);
	
	public FilmsDto getByID(Integer id);
	
	public List<FilmsDto> readAll();
	
	public String deleteById(Integer id);

	
}
