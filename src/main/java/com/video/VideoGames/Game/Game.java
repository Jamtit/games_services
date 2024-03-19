package com.video.VideoGames.Game;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "games")
@Data
public class Game {
    @Id
    @Column(name = "game_id", nullable = false)
    @NotNull
    private Long id;

    @Column(name = "game_name")
    private String gameName;
    @Column(name = "release_year")
    private String releaseYear;
    @Column(name = "company_id")
    private Long companyId;

}
