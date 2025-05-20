package br.com.dev.lacerda.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev.lacerda.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
