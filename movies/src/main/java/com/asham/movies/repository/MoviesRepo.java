package com.asham.movies.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asham.movies.dto.MoviesDto;

@Repository
public interface MoviesRepo extends JpaRepository<MoviesDto, Serializable>{

}
