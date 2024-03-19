package com.video.VideoGames.Game;

import com.video.VideoGames.Game.exceptions.GameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService service){
        this.gameService = service;
    }

    @GetMapping
    private ResponseEntity<List<Game>> getAllGames(){
        return new ResponseEntity<>(gameService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Game> createGame(@RequestBody Game game){
        Game createdGame = gameService.createGame(game);
        return new ResponseEntity<>(createdGame, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    private ResponseEntity<Game> getGameById(@PathVariable final long id) throws GameNotFoundException {
        return new ResponseEntity<>(gameService.findById(id), HttpStatus.OK);
    }

    @PatchMapping
    private ResponseEntity<Game> updateGame(@RequestBody Game game) throws  GameNotFoundException{
        return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    }

    @DeleteMapping
    private ResponseEntity<Void> deleteAllGames(){
        gameService.deleteAll();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    private ResponseEntity<Void> deleteGameById(@PathVariable final long id){
        gameService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
