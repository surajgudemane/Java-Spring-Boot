package com.ashamam.charger.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashamam.charger.dto.ChargerDto;

@Repository
public interface ChargerRepo extends JpaRepository<ChargerDto, Serializable>{

}
