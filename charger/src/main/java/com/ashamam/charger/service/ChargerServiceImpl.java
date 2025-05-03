package com.ashamam.charger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashamam.charger.repository.ChargerRepo;
import com.ashamam.charger.dto.ChargerDto;
import com.ashamam.charger.exception.ChargerExitAlready;

@Service
public class ChargerServiceImpl implements ChargerService{

	@Autowired
	private ChargerRepo repo;
	
	@Override
	public String create(ChargerDto dto) {
		ChargerDto existCharger = repo.findById(dto.getId()).orElse(null);
		if(existCharger == null) {
	
			if(dto.getId() > 0) {
				if(dto.getName().length() > 4) {
					Integer watt = Integer.parseInt(dto.getWatt());
					if(watt >= 18) {
						repo.save(dto);
						return "Saved Sucessfully";
					}else 
						return "Invalid Watt / Watt Shuld not be < 18";
				} else
					return "Invalid Name / Name Length Should be > 4";
			} else
				return "Id cannot be <= 0";
		}
		else
			throw new ChargerExitAlready("id is already present");
	}

	@Override
	public ChargerDto findById(Integer id) {
		Optional<ChargerDto> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<ChargerDto> readAll() {
		
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)){
			repo.deleteById(id);
			return "deleted Sucessfully";
		}
		
		return "Failed";
	}

}
