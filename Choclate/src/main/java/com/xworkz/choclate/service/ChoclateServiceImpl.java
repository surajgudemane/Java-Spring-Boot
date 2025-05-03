package com.xworkz.choclate.service;

import java.util.List;

import com.xworkz.choclate.dto.ChoclateDto;
import com.xworkz.choclate.repo.ChoclateRepo;
import com.xworkz.choclate.repo.ChoclateRepoImpl;

public class ChoclateServiceImpl implements ChoclateService {

	ChoclateRepo repo = new ChoclateRepoImpl();
	
	public boolean createAll(List<ChoclateDto> data) {
		if(data != null) {
			for (ChoclateDto dto : data) {
				if(dto.getId() > 0) {
					if(dto.getName().length() > 4) {
						if(dto.getWeight() > 10) {
							System.out.println("Data is Validated and Sending to Repository");
							repo.createAll(dto);
						}
					}
				}
			}
			return true;
		}
		System.out.println("Data is Invalid");
		return false;
	}

	public List<ChoclateDto> readAll() {
		return repo.readAll();
	}

	public ChoclateDto findByColorAndWeight(String color, int weight) {
		if(color.length() > 3 && weight > 10) {
			return repo.findByColorAndWeight(color, weight);
		}
		return null;
	}

	public ChoclateDto findByPriceAndName(int price, String name) {
		if(name.length() > 3 && price >= 10) {
			return repo.findByPriceAndName(price, name);
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(int weight, String name, String color) {
		if(weight > 10) {
			if(name.length() > 4 && color.length() > 3) {
				return repo.updateWeightByNameAndColor(weight, name, color);
			}
		}
		return false;
	}

	public boolean updateNameByidAndWeight(String name, int id, int weight) {
		if(name.length() > 4) {
			if(id > 0 && weight > 10) {
				return repo.updateNameByidAndWeight(name, id, weight);
			}
		}
		return false;
	}

	public boolean deletebyColorAndName(String color, String name) {
		if(color.length() > 3 && name.length() > 4) {
			return repo.deletebyColorAndName(color, name);
		}
		return false;
	}

	public boolean updateNameById(String name, int id) {
		if(name.length() > 4 && id > 0) {
			return repo.updateNameById(name, id);
		}
		return false;
	}

	public ChoclateDto findById(int id) {
		if(id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	public boolean deleteById(int id) {
		if(id > 0) {
			return repo.deleteById(id);
		}
		return false;
	}

}
