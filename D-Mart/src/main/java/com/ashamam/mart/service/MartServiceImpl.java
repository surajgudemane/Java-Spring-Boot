package com.ashamam.mart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashamam.mart.dto.MartDto;
import com.ashamam.mart.exception.MartExistAlready;
import com.ashamam.mart.repository.MartRepository;

@Service
public class MartServiceImpl implements MartService {
	
	@Autowired
	private MartRepository repo;

	@Override
	public Boolean addDto(MartDto dto) {
		if(dto.getItem().length() > 2) {
			if(dto.getPrice() > 0) {
				MartDto orElse = repo.findById(dto.getId()).orElse(null);
				if(orElse == null) {
					repo.save(dto);
					return true;
				}
				throw new MartExistAlready("Id Already Exist");
			}
			throw new MartExistAlready("Price Should be Greater than 0");
		}
		throw new MartExistAlready("Item name length should be greater than 2 char");
	}

	@Override
	public MartDto findById(Integer id) {
		Optional<MartDto> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		throw new MartExistAlready("Ther is no Dto present with respect your Id entered");
	}

	@Override
	public List<MartDto> readAll() {
		List<MartDto> findAll = repo.findAll();
		if(findAll.isEmpty()) {
			throw new MartExistAlready("Dto is Empty... Please Add some dto");
		}
		return findAll;	
	}
	
	@Override
	public Boolean update(MartDto dto) {
		if(dto.getItem().length() > 2) {
			if(dto.getPrice() > 0) {
				MartDto orElse = repo.findById(dto.getId()).orElse(null);
				if(orElse != null) {
					repo.save(dto);
					return true;
				}
				throw new MartExistAlready("Please Enter Existed Id to Update");
			}
			throw new MartExistAlready("Price Should be Greater than 0");
		}
		throw new MartExistAlready("Item name length should be greater than 2 char");
	}

	@Override
	public Boolean deleteById(Integer id) {
		Boolean existsById = repo.existsById(id);
		if(existsById) {
			repo.deleteById(id);
			return true;
		}
		throw new MartExistAlready("Ther is no Dto present with respect your Id entered");
	}


}
