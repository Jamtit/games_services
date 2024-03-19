package com.video.VideoGames.company;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "company")
@Data
public class Company {

    @Id
    @Column(name = "id", nullable = false)
    @NotNull
    private long id;

    @NotBlank
    @NotNull
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "estb_year")
    private String estb_year;

}
