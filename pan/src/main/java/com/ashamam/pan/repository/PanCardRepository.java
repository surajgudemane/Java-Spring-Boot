package com.ashamam.pan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashamam.pan.dto.PanDto;

@Repository
public interface PanCardRepository extends JpaRepository<PanDto, Integer>{

}
