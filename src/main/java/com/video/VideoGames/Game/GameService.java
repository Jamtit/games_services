package com.video.VideoGames.Game;

import com.video.VideoGames.Game.exceptions.GameException;
import com.video.VideoGames.Game.exceptions.GameNotFoundException;

import java.util.List;

public interface GameService {
    List<Game> findAll();
    Game findById(Long id) throws GameNotFoundException;
    Game save(Game game);

    Game createGame(Game game);

    Game update(Game game) throws GameNotFoundException;

    void deleteAll();

    void deleteById(Long id);

}
