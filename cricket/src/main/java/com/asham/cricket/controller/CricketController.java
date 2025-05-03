package com.asham.cricket.controller;

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asham.cricket.coustumExceeption.CricketControllerException;
import com.asham.cricket.coustumExceeption.CricketLogicException;
import com.asham.cricket.dto.CricketDto;
import com.asham.cricket.service.CricketServiceImpl;

@RestController
public class CricketController {

	private static final Logger logger = LoggerFactory.getLogger(CricketController.class);
	@Autowired
	private CricketServiceImpl service;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> create(@RequestBody CricketDto dto){
		try {
			logger.info("this is my information");
			return new ResponseEntity<String>(service.saveAll(dto), HttpStatus.CREATED);
		} catch (CricketLogicException e) {
			CricketControllerException cce = new CricketControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<CricketControllerException>(cce, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findUsingId(@PathVariable Integer id){
		
		try {
			CricketDto findById = service.findById(id);
			return new ResponseEntity<CricketDto>(findById, HttpStatus.OK);
		} catch (CricketLogicException e) {
			CricketControllerException cce = new CricketControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<CricketControllerException>(cce,HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			CricketControllerException cce = new CricketControllerException("911", "Somwthing went wrong in Controler While Finding");
			return new ResponseEntity<CricketControllerException>(cce, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/read")
	public ResponseEntity<?> read(){
		try {
			return new ResponseEntity<List<CricketDto>> (service.readAll(), HttpStatus.OK);
		} catch (CricketLogicException e) {
			CricketControllerException cce = new CricketControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<CricketControllerException>(cce,HttpStatus.BAD_REQUEST);
		} 
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody CricketDto dto){
		try{
			return new ResponseEntity<String>(service.saveAll(dto), HttpStatus.CREATED);
		} catch (CricketLogicException e) {
			CricketControllerException cce = new CricketControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<CricketControllerException>(cce,HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			CricketControllerException cce = new CricketControllerException("913", "Somwthing went wrong in Controler While Updating");
			return new ResponseEntity<CricketControllerException>(cce, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUsingId(@PathVariable Integer id){
		try{
			logger.error("i deleted");
			return new ResponseEntity<String>(service.deleteById(id), HttpStatus.CREATED);
		} catch (CricketLogicException e) {
			CricketControllerException cce = new CricketControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<CricketControllerException>(cce,HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			CricketControllerException cce = new CricketControllerException("914", "Somwthing went wrong in Controler While Deleting");
			return new ResponseEntity<CricketControllerException>(cce, HttpStatus.BAD_REQUEST);
		}
		
	}
}
