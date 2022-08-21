package com.example.dbconnection.Services;

import com.example.dbconnection.Dao.EtudiantRepository;
import com.example.dbconnection.Entities.Etudiants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class services  {

     private EtudiantRepository etudiantRepository;
    @Autowired
    public services(EtudiantRepository etudiant){
        etudiantRepository=etudiant;
    }
    public void save(Etudiants e){
        etudiantRepository.save(e);
    }
    public List<Etudiants> findAll(){

        return  etudiantRepository.findAll();
    }

}
