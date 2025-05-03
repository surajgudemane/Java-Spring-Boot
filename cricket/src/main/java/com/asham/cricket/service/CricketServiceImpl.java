package com.asham.cricket.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asham.cricket.coustumExceeption.CricketLogicException;
import com.asham.cricket.dto.CricketDto;
import com.asham.cricket.repository.CricketRepo;


@Service
public class CricketServiceImpl implements CricketService {

	@Autowired
	private CricketRepo repo;

	@Override
	public String saveAll(CricketDto dto) {

		try {

			if (dto.getName().length() < 2) {
				throw new CricketLogicException("901", "Please Send Valid Name, Your Entred Name is Blank");
			} else {
				repo.save(dto);
				return "Saved Sucessfully";
			}
		} catch (Exception e) {
			throw new CricketLogicException("902", "Full Entity is Null, Please Input Come Data");
		}

	}

	@Override
	public CricketDto findById(Integer id) {

		try {

			return repo.findById(id).get();

		} catch (IllegalArgumentException e) {
			throw new CricketLogicException("904","Given id is Null, Please send some id  to be searched" + e.getMessage());
		} catch (NoSuchElementException e) {
			throw new CricketLogicException("905","Given id is doesnot Exist in Database" + e.getMessage());
		}

	}

	@Override
	public List<CricketDto> readAll() {
		try {
			List<CricketDto> findAll = repo.findAll();
			if (findAll.isEmpty()) {
				throw new CricketLogicException("906","Your Database is Empty, Please Add Some data before Retrive the data");
			}else
			return findAll;

		} catch (Exception e) {
			throw new CricketLogicException("907","Something went Wrong in Srevice Layer, While fetching the data" + e.getMessage());
		}

	}

	@Override
	public String deleteById(Integer id) {
		
		try {

			repo.deleteById(id);
			return "Deleted Sucessfully";

		} catch (IllegalArgumentException e) {
			throw new CricketLogicException("908","Given id is Null, Please send some id  to be Deleted" + e.getMessage());
		} catch (NoSuchElementException e) {
			throw new CricketLogicException("909","Given id is doesnot Exist in Database to Delete" + e.getMessage());
		}

	}

}
