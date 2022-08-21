package com.example.dbconnection;

import com.example.dbconnection.Dao.EtudiantRepository;
import com.example.dbconnection.Entities.Etudiants;
import com.example.dbconnection.Services.services;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

@RestController
public class MyRunner  {
    private services  servicess;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy", Locale.ENGLISH);

    @Autowired
    public MyRunner(services  servicess){
        servicess=servicess;
    }
    public void insertinto() throws ParseException {
        servicess.save(new Etudiants(null,"ayoub ouabi","ayoubob69@gmail.com", formatter.parse("06/09/1999"), 250));
        servicess.save(new Etudiants(null,"mohamed ouabi","mohamed@gmail.com", formatter.parse("06/09/1996"),50));
        servicess.save(new Etudiants(null,"abdo ouabi","abdo@gmail.com", formatter.parse("06/09/1995"),10));
        servicess.save(new Etudiants(null,"brahim ouabi","brahim@gmail.com", formatter.parse("06/09/1994"),280));
    }
   /* @Autowired

    @Override
    public void run(String... args) throws Exception {
        servicess.save(new Etudiants(null,"ayoub ouabi","ayoubob69@gmail.com", formatter.parse("06/09/1999"), 250));
        servicess.save(new Etudiants(null,"mohamed ouabi","mohamed@gmail.com", formatter.parse("06/09/1996"),50));
        servicess.save(new Etudiants(null,"abdo ouabi","abdo@gmail.com", formatter.parse("06/09/1995"),10));
        servicess.save(new Etudiants(null,"brahim ouabi","brahim@gmail.com", formatter.parse("06/09/1994"),280));
        //servicess.findAll().forEach(etudiants -> System.out.println(etudiants.toString()));
    }*/
}
