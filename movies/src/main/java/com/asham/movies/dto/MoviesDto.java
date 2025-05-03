package com.asham.movies.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "film_info")
public class MoviesDto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String filmName;
	private String hero;
	private String heroine;
	private Integer durationInMin;
	private String language;
	
	public MoviesDto(Integer id, String filmName, String hero, String heroine, Integer durationInMin, String language) {
		super();
		this.id = id;
		this.filmName = filmName;
		this.hero = hero;
		this.heroine = heroine;
		this.durationInMin = durationInMin;
		this.language = language;
	}
	public MoviesDto() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	public Integer getDurationInMin() {
		return durationInMin;
	}
	public void setDurationInMin(Integer durationInMin) {
		this.durationInMin = durationInMin;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "MoviesDto [id=" + id + ", filmName=" + filmName + ", hero=" + hero + ", heroine=" + heroine
				+ ", durationInMin=" + durationInMin + ", language=" + language + "]";
	}
	
}
