package com.asham.watch.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asham.watch.dto.WatchDto;

@Repository
public interface WatchRepo extends JpaRepository<WatchDto, Serializable>{

}
