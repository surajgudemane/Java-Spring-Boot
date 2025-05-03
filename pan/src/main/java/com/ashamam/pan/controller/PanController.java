package com.ashamam.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashamam.pan.dto.PanDto;
import com.ashamam.pan.service.PanCardServiceImpl;

@RequestMapping("/India/PanCard/service")
@RestController
public class PanController {

	@Autowired
	private PanCardServiceImpl service;
	
	@PostMapping("/add")
	public String save(@RequestBody PanDto dto) {
		Boolean save = service.SavePanCard(dto);
		if(save) {
			return "PAN Details Savved Sucessfully";
		}
		return "Failed to Save PAN Card";
	}
	
	@GetMapping("/findPan/{id}")
	public PanDto findUsingId(@PathVariable Integer id) {
		PanDto findPanById = service.findPanById(id);
		if(findPanById != null) {
			return findPanById;
		}
		return null;
	}
	
	@GetMapping("/savedPan")
	public List<PanDto> shaowPan(){
		List<PanDto> findPanById = service.readAll();
		if(findPanById != null) {
			return findPanById;
		}
		return null;
	}
	
	@PostMapping("/update")
	public String update(@RequestBody PanDto dto) {
		Boolean existsById = service.SavePanCard(dto);
		if(existsById) {
			return "PAN Details Updated Sucessfully";
		}
		return "Failed to Save PAN Card";
	}
	
	@DeleteMapping("/remove")
	public String delete (@PathVariable Integer id) {
		Boolean delete = service.deletePanById(id);
		if(delete) {
			return "PAN Deleted Sucessfully";
		}
		return "Failed to Remove PAN Card";
	}
	
}
