package com.ashamam.phone.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashamam.phone.dto.PhoneDto;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneDto, Serializable>{

}
