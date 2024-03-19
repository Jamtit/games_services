package com.video.VideoGames.Game.exceptions;

public class GameNotFoundException extends GameException{
    public GameNotFoundException(Long id){
        super("Can't find a game with id: " + id);
    }
}
