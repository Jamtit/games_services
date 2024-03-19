package com.video.VideoGames.company.exception;

public class CompanyNotFoundException extends CompanyException{
    public CompanyNotFoundException(Long id){
        super("Can't find a company with ID: " + id);
    }
}
