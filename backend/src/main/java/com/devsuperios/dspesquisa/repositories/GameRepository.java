package com.devsuperios.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
