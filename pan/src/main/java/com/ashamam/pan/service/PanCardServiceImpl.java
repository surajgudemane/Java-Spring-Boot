package com.ashamam.pan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashamam.pan.dto.PanDto;
import com.ashamam.pan.repository.PanCardRepository;

@Service
public class PanCardServiceImpl implements PanCardService {

	@Autowired
	private PanCardRepository repo;
	
	@Override
	public Boolean SavePanCard(PanDto dto) {
		if(dto.getName().length() > 2) {
			if(dto.getPanNum().length() == 10) {
				PanDto orElse = repo.findById(dto.getId()).orElse(null);
				if(orElse == null) {
					repo.save(dto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public PanDto findPanById(Integer id) {
		if(id != null) {
			if(id > 0 ) {
				Optional<PanDto> findById = repo.findById(id);
				if(findById.isPresent()) {
					return findById.get();					
				}
			}
		}
		return null;
	}

	@Override
	public List<PanDto> readAll() {
		List<PanDto> findAll = repo.findAll();
		if(findAll.isEmpty()) {
			return null;
	d	}
		return findAll;
	}

	@Override
	public Boolean updatePanDto(PanDto dto) {
		if(dto.getName().length() > 2) {
			if(dto.getPanNum().length() == 10) {
				PanDto orElse = repo.findById(dto.getId()).orElse(null);
				if(orElse != null) {
					repo.save(dto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Boolean deletePanById(Integer id) {
		if(id == null) {
			if(id > 0 ) {
				Boolean existsById = repo.existsById(id);
				if(existsById) {
					repo.deleteById(id);
					return true;
				}
			}
		}
		return false;
	}

}
