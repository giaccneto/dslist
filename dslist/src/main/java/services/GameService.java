package services;

import dto.GameMinDTO;
import entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.GameRepository;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
       var result = gameRepository.findAll();
       return result;
    }
}
