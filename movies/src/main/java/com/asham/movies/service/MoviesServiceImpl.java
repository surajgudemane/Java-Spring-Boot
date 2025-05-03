package com.asham.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asham.movies.dto.MoviesDto;
import com.asham.movies.repository.MoviesRepo;

@Service
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesRepo repo;
	
	@Override
	public String saveData(MoviesDto dto) {
		if(dto != null) {
			repo.save(dto);
			return "Saved Sucessfully";
		}
		return "Save Failed";
	}

	@Override
	public MoviesDto findById(Integer id) {
		Optional<MoviesDto> data = repo.findById(id);
		if(data.isPresent()) {
			data.get();
		}
		return null;
	}

	@Override
	public List<MoviesDto> showAll() {
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Deleted Sucessfully";
		}
		return "Failed to Delete";
	}

}
