package br.com.dev.lacerda.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev.lacerda.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
