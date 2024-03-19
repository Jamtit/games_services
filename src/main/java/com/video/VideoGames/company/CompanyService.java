package com.video.VideoGames.company;

import com.video.VideoGames.Game.Game;
import com.video.VideoGames.Game.exceptions.GameNotFoundException;
import com.video.VideoGames.company.exception.CompanyNotFoundException;

import java.util.List;

public interface CompanyService {

    List<Company> findAll();
    Company findById(Long id) throws CompanyNotFoundException;
    Company save(Company company);

    Company createCompany(Company company);

    Company update(Company company) throws CompanyNotFoundException;

    void deleteAll();

    void deleteById(Long id);
}
