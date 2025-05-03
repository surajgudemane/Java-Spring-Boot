package com.asham.films.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asham.films.dto.FilmsDto;
import com.asham.films.repository.FilmsRepository;

@Service
public class FilmsService implements FilmServiceInterface{

	@Autowired
	private FilmsRepository repo;
	
	@Override
	public String save(FilmsDto dto) {
		if(dto != null) {
			repo.save(dto);
			return "Saved Sucessfully";
		}
		return "Not Saved";
	}

	@Override
	public FilmsDto getByID(Integer id) {
		Optional<FilmsDto> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<FilmsDto> readAll() {
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Deleted Sucessfully";
		}
		return "Id Not fund";
	}

}
