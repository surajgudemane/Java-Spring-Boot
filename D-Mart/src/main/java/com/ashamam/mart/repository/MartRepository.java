package com.ashamam.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashamam.mart.dto.MartDto;

@Repository
public interface MartRepository  extends JpaRepository<MartDto, Integer>{

}
