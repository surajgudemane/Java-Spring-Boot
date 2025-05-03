package com.ashamam.phone.controller;

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

import com.ashamam.phone.dto.PhoneDto;
import com.ashamam.phone.exception.ExceptionInController;
import com.ashamam.phone.exception.ExceptionInService;
import com.ashamam.phone.service.PhoneServiceImpl;

@RestController
public class PhoneController {

	@Autowired
	private PhoneServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<?> create(@RequestBody PhoneDto dto){
		try {
			Boolean saveAll = service.saveAll(dto);
			return new ResponseEntity<Boolean>(saveAll, HttpStatus.CREATED);
		} catch (ExceptionInService e) {
			ExceptionInController ec = new ExceptionInController(e.getErrorMsg());
			return new ResponseEntity<ExceptionInController>(ec, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<?> findUsingId(@PathVariable Integer id){
		try {
			PhoneDto findById = service.findById(id);
			return new ResponseEntity<PhoneDto>(findById,HttpStatus.OK);
		}  catch (ExceptionInService e) {
			ExceptionInController ec = new ExceptionInController(e.getErrorMsg());
			return new ResponseEntity<ExceptionInController>(ec, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/read")
	public ResponseEntity<?> ShowAll(){
		try {
			List<PhoneDto> readAll = service.readAll();
			return new ResponseEntity<List<PhoneDto>>(readAll, HttpStatus.OK);
		}  catch (ExceptionInService e) {
			ExceptionInController ec = new ExceptionInController(e.getErrorMsg());
			return new ResponseEntity<ExceptionInController>(ec, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateDto(@RequestBody PhoneDto dto){ 
		try {
			return new ResponseEntity<Boolean>(service.saveAll(dto), HttpStatus.CREATED);
		}  catch (ExceptionInService e) {
			ExceptionInController ec = new ExceptionInController(e.getErrorMsg());
			return new ResponseEntity<ExceptionInController>(ec, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUsingId(@PathVariable Integer id){
		try {
			Boolean removeById = service.removeById(id);
			return new ResponseEntity<Boolean>(removeById,HttpStatus.OK);
		}  catch (ExceptionInService e) {
			ExceptionInController ec = new ExceptionInController(e.getErrorMsg());
			return new ResponseEntity<ExceptionInController>(ec, HttpStatus.BAD_REQUEST);
		}
	}
	
}
