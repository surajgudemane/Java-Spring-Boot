package com.asham.films.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asham.films.dto.FilmsDto;
import com.asham.films.service.FilmServiceInterface;

@RestController
public class FilmController {

	@Autowired
	private FilmServiceInterface service;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> create(@RequestBody FilmsDto dto){
		String save = service.save(dto);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<FilmsDto> findById(@PathVariable Integer id) {
		FilmsDto find = service.getByID(id);
		return new ResponseEntity<FilmsDto>(find, HttpStatus.OK);
	}
	
	@GetMapping("/read")
	public ResponseEntity<List<FilmsDto>> showAll(){
		List<FilmsDto> show = service.readAll();		
		return new ResponseEntity<List<FilmsDto>>(show, HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> update(@RequestBody FilmsDto dto){
		String status = service.save(dto);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		String delete = service.deleteById(id);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}
	
}
