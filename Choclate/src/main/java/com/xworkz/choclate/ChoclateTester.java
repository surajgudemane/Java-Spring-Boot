package com.xworkz.choclate;

import java.util.Arrays;
import java.util.List;

import com.xworkz.choclate.dto.ChoclateDto;
import com.xworkz.choclate.service.ChoclateService;
import com.xworkz.choclate.service.ChoclateServiceImpl;

public class ChoclateTester {

	public static void main(String[] args) {
		
		ChoclateDto dto1 = new ChoclateDto(1, "Dairy Milk", "Brown", 50, 45);
		ChoclateDto dto2 = new ChoclateDto(2, "Milky Bar", "White", 20, 15);
		ChoclateDto dto3 = new ChoclateDto(3, "Nestle", "Gold", 40, 35);
		ChoclateDto dto4 = new ChoclateDto(4, "Cocacraft", "Dark Brown", 100, 200);
		ChoclateDto dto5 = new ChoclateDto(5, "Eat Better", "Black", 75, 70);
		ChoclateDto dto6 = new ChoclateDto(6, "Parle", "Greay", 50, 60);
		ChoclateDto dto7 = new ChoclateDto(7, "5 Star", "Gold", 20, 10);
		ChoclateDto dto8 = new ChoclateDto(8, "Hershey's", "Golden Brown", 100, 600);
		ChoclateDto dto9 = new ChoclateDto(9, "Wacao", "White", 80, 40);
		ChoclateDto dto10 = new ChoclateDto(10, "Kit Kat", "Brown", 30, 45);
		
		ChoclateService service = new ChoclateServiceImpl();
		
		List<ChoclateDto> list = Arrays.asList(dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10);

		
//		service.createAll(list);
//		
//		for (ChoclateDto dto : service.readAll()) {
//			System.out.println(dto);
//		}
//		
//		System.out.println(service.findByColorAndWeight("White", 20));
//		
//		System.out.println(service.findByPriceAndName(10, "5 Star"));
//		
//		service.updateWeightByNameAndColor(100, "Nestle", "Gold");
//		
//		service.updateNameByidAndWeight("Snikers", 9, 80);
//		
//		service.deletebyColorAndName("Gold", "Nestle");
//		
//		service.updateNameById("Wacao", 9);
//		
//		System.out.println(service.findById(8));
		
		service.deleteById(5);
	}

}
