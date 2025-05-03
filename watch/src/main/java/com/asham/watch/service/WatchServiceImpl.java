package com.asham.watch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asham.watch.dto.WatchDto;
import com.asham.watch.repository.WatchRepo;

@Service
public class WatchServiceImpl implements WatchService {

	@Autowired
	private WatchRepo repo;
	
	@Override
	public String saveDto(WatchDto dto) {
		if(dto != null) {
			repo.save(dto);
			return "Saved Sucessfull";
		}
		return "Falied to Save";
	}

	@Override
	public WatchDto findById(Integer id) {
		Optional<WatchDto> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<WatchDto> readAll() {
		List<WatchDto> allData = repo.findAll();
		return allData;
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Deleted Sucessfully";
		}
		return "Falied to Delete";
	}

	
	
}
