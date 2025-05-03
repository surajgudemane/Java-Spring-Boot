package com.asham.cricket.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asham.cricket.dto.CricketDto;

@Repository
public interface CricketRepo extends JpaRepository<CricketDto, Serializable>{

	
}
