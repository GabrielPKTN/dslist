package br.com.dev.lacerda.dslist.dto;

import br.com.dev.lacerda.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;

	public GameListDTO() {
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
