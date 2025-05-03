package com.ashamam.mart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashamam.mart.dto.MartDto;
import com.ashamam.mart.service.MartServiceImpl;

@RestController
public class MartController {

	@Autowired
	private MartServiceImpl service;
	
	@PostMapping("/save")
	public String create(@RequestBody MartDto dto) {
		Boolean addDto = service.addDto(dto);
		if(addDto == true) {
			return "Saved Sucessfully";
		}
		return "Failed to Save Dto";
	}
	
	@GetMapping("/find/{id}")
	public MartDto serachBuId(@PathVariable Integer id) {
		MartDto findById = service.findById(id);
		return findById;	
	}
	
	@GetMapping("/readAll")
	public List<MartDto> showAll(){
		return service.readAll();
	}
	
	@PutMapping("/update")
	public String updateById(@RequestBody MartDto dto) {
		Boolean addDto = service.update(dto);
		if(addDto == true) {
			return "Updated Sucessfully";
		}
		return "Failed to Update Dto";
	}
	
	@DeleteMapping("/delete/{id}")
	public String removeById(@PathVariable Integer id) {
		Boolean deleteById = service.deleteById(id);
		if(deleteById) {
			return "Deleted Sucessfully";
		}
		return "Failed to Delete";
	}
}
