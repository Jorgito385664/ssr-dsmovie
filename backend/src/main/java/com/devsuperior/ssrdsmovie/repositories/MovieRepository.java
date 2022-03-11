package com.devsuperior.ssrdsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ssrdsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
	
	
	
}
