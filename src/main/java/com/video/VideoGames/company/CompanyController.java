package com.video.VideoGames.company;

import com.video.VideoGames.company.exception.CompanyNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/company")
public class CompanyController {

    private final CompanyService service;

    public CompanyController(CompanyService service){
        this.service = service;
    }

    @GetMapping
    private ResponseEntity<List<Company>> getAllCompanies(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Company> createCompany(@RequestBody Company company){
        Company createdGame = service.createCompany(company);
        return new ResponseEntity<>(createdGame, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    private ResponseEntity<Company> getCompanyById(@PathVariable final long id) throws CompanyNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PatchMapping
    private ResponseEntity<Company> updateCompany(@RequestBody Company company) throws  CompanyNotFoundException{
        return new ResponseEntity<>(service.update(company), HttpStatus.OK);
    }

    @DeleteMapping
    private ResponseEntity<Void> deleteAllCompanies(){
        service.deleteAll();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    private ResponseEntity<Void> deleteCompanyById(@PathVariable final long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
