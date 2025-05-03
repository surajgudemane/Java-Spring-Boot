package com.asham.watch.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.asham.watch.dto.WatchDto;
import com.asham.watch.service.WatchServiceImpl;

@RestController
public class WatchController {

	@Autowired
	WatchServiceImpl service;
	
	private static final Logger logger = LoggerFactory.getLogger(WatchController.class);
	
	@PostMapping("/save")
	public ResponseEntity<String> create(@RequestBody WatchDto dto){
		logger.trace("asdfghjliuytrewqasdcvbnjhgrewqwertyu");
		return new ResponseEntity<String>(service.saveDto(dto), HttpStatus.CREATED);
	}
	
	@GetMapping("/find")
	public ResponseEntity<WatchDto> findById(@PathVariable Integer id){
		return new ResponseEntity<WatchDto>(service.findById(id), HttpStatus.OK);
	}
	
	@GetMapping("/read")
	public ResponseEntity<List<WatchDto>> readAll(){
		return new ResponseEntity<List<WatchDto>>(service.readAll(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateData(@RequestBody WatchDto dto){
		return new ResponseEntity<String>(service.saveDto(dto), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		return new ResponseEntity<String>(service.deleteById(id), HttpStatus.OK);
	}
	
}
