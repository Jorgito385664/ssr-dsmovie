package com.devsuperior.ssrdsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ssrdsmovie.entities.Score;
import com.devsuperior.ssrdsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK> {
	
	
	
}
