package com.video.VideoGames.Game;

import com.video.VideoGames.Game.exceptions.GameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService{
    private final GameRepository gameRepository;

    @Autowired
    public GameServiceImpl(GameRepository repository){
        this.gameRepository = repository;
    }

    @Override
    public List<Game> findAll(){
        return gameRepository.findAll();
    }

    @Override
    public Game findById(Long id) throws GameNotFoundException {
        Optional<Game> foundGame = gameRepository.findById(id);
        return foundGame.orElseThrow(() -> new GameNotFoundException(id));
    }

    @Override
    public Game save(Game game){
        return gameRepository.save(game);
    }

    @Override
    public Game createGame(Game game){
        return gameRepository.save(game);
    }

    @Override
    public Game update(Game game) throws GameNotFoundException {
        Game receivedGame = gameRepository.findById(game.getId()).orElseThrow(() -> new GameNotFoundException(game.getId()));
        receivedGame.setGameName(game.getGameName());
        receivedGame.setId(game.getId());
        receivedGame.setReleaseYear(game.getReleaseYear());
        receivedGame.setCompanyId(game.getCompanyId());
        gameRepository.save(receivedGame);
        return receivedGame;

    }

    @Override
    public void deleteAll(){
        gameRepository.deleteAll();
    }

    @Override
    public void deleteById(Long id){
        gameRepository.deleteById(id);
    }

}
