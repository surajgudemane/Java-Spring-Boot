package com.ashamam.phone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashamam.phone.dto.PhoneDto;
import com.ashamam.phone.exception.ExceptionInService;
import com.ashamam.phone.repository.PhoneRepository;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneRepository repo;

	@Override
	public Boolean saveAll(PhoneDto dto) {
		try {
			if (dto.getName().length() >= 2) {
				if (dto.getPrice() >= 10000) {
					repo.save(dto);
					return true;
				}
				throw new ExceptionInService("Price Should be Greater than 10000");
			}
			throw new ExceptionInService("Please enter valid Name");
		} catch (ExceptionInService e) {
			throw new ExceptionInService(e.getErrorMsg());
		}
	}

	@Override
	public PhoneDto findById(Integer id) {
		try {
			if (id > 0) {
				Optional<PhoneDto> findById = repo.findById(id);
				if (findById.isPresent()) {
					return findById.get();
				} else {
					throw new ExceptionInService("Dto you'r searching with respect to Entered Id is Not Avilable in your DataBase");
				}
			} else {
				throw new ExceptionInService("Id Should be Greater than Zero");
			}
		} catch (ExceptionInService e) {
			throw new ExceptionInService(e.getErrorMsg());
		}
	}

	@Override
	public List<PhoneDto> readAll() {
		List<PhoneDto> findAll = repo.findAll();
		try {
			if (findAll.isEmpty()) {
				throw new ExceptionInService("there is no Data Present In Your DataBase");
			} else {
				return findAll;
			}
		} catch (ExceptionInService e) {
			throw new ExceptionInService(e.getErrorMsg());
		}

	}

	@Override
	public Boolean removeById(Integer id) {
		try {
			if (id > 0) {
				Boolean existCheck = repo.existsById(id);
				if (existCheck) {
					repo.deleteById(id);
					return true;
				} throw new ExceptionInService("Dto you'r Deleting with respect to Entered Id is Not Avilable in your DataBase");
			} throw new ExceptionInService("Id Should be non-zero number and should not be Null");
		} catch (ExceptionInService e) {
			throw new ExceptionInService(e.getErrorMsg());
		}

	}

}
