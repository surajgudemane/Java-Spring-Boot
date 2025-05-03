package com.ashamam.charger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashamam.charger.dto.ChargerDto;
import com.ashamam.charger.service.ChargerServiceImpl;

@RestController
public class ChargerController {

	@Autowired
	private ChargerServiceImpl service;
	
	@PostMapping("/save")
	public String add(@RequestBody ChargerDto dto) {
		return service.create(dto);
	}
	
	@GetMapping("/find/{id}")
	public ChargerDto FindUsingId(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@GetMapping("/read")
	public List<ChargerDto> readAll(){
		return service.readAll();
	}
	
	@PutMapping("/update/{id}")
	public String update(@RequestBody ChargerDto dto) {
		return service.create(dto);
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteUsingId(@PathVariable Integer id) {
		return service.deleteById(id);
	}
}
