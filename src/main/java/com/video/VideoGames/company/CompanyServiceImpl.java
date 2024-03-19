package com.video.VideoGames.company;

import com.video.VideoGames.Game.Game;
import com.video.VideoGames.Game.exceptions.GameNotFoundException;
import com.video.VideoGames.company.exception.CompanyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    @Override
    public Company findById(Long id) throws CompanyNotFoundException {
        return companyRepository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
    }

    @Override
    public Company save(Company company){
        return companyRepository.save(company);
    }

    @Override
    public Company createCompany(Company company){
        return companyRepository.save(company);
    }

    @Override
    public Company update(Company company) throws CompanyNotFoundException {
        Company receivedCompany = companyRepository.findById(company.getId()).orElseThrow(() -> new CompanyNotFoundException(company.getId()));
        receivedCompany.setCompany_name(company.getCompany_name());
        receivedCompany.setId(company.getId());
        receivedCompany.setEstb_year(company.getEstb_year());
        companyRepository.save(receivedCompany);
        return receivedCompany;

    }

    @Override
    public void deleteAll(){
        companyRepository.deleteAll();
    }

    @Override
    public void deleteById(Long id){
        companyRepository.deleteById(id);
    }

}
