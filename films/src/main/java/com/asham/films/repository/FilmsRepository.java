package com.asham.films.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asham.films.dto.FilmsDto;

@Repository
public interface FilmsRepository extends JpaRepository<FilmsDto, Serializable> {

	
	
}
