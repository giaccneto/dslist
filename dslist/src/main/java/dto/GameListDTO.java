package dto;

import entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;
    public GameListDTO(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GameListDTO(GameList entity){

        id = entity.getId();
        name = entity.getName();

    }
}
