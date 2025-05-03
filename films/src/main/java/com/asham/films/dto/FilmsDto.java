package com.asham.films.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Data
@Entity
@Table(name = "film_info")
public class FilmsDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer durationInMin;
	private String language;
	private String heroName;
	private String heroineName;
	private Integer budgetInCr;
	
	
	
}
