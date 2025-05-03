package com.asham.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asham.movies.dto.MoviesDto;
import com.asham.movies.service.MoviesServiceImpl;

@RestController
public class MoviesController {

	@Autowired
	MoviesServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<String> create(@RequestBody MoviesDto dto) {
		
		String saveData = service.saveData(dto);
		return new ResponseEntity<String>(saveData,HttpStatus.CREATED);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<MoviesDto> searchById(@PathVariable Integer id){
		MoviesDto searched = service.findById(id);
		return new ResponseEntity<MoviesDto>(searched,HttpStatus.OK);
	}
	
	@GetMapping("/read")
	public ResponseEntity<List<MoviesDto>> readAll(){
		List<MoviesDto> allData = service.showAll();
		return new ResponseEntity<List<MoviesDto>>(allData, HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> update(@RequestBody MoviesDto dto) {
		String updateData = service.saveData(dto);
		return new ResponseEntity<String>(updateData,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUsingId(@PathVariable Integer id){
		String deleteData = service.deleteById(id);
		return new ResponseEntity<String>(deleteData, HttpStatus.OK);
	}
	
}
