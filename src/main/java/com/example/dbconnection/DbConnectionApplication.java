package com.example.dbconnection;

  import com.example.dbconnection.Entities.Etudiants;
 import com.example.dbconnection.Services.services;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.CommandLineRunner;
 import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

  import java.text.SimpleDateFormat;
 import java.util.Locale;


@SpringBootApplication

public class DbConnectionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DbConnectionApplication.class, args);

    }
     private services servicess;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy", Locale.ENGLISH);
    @Override
    public void run(String... args) throws Exception {
        servicess.save(new Etudiants(null,"ayoub ouabi","ayoubob69@gmail.com", formatter.parse("06/09/1999"), 250));
        servicess.save(new Etudiants(null,"mohamed ouabi","mohamed@gmail.com", formatter.parse("06/09/1996"),50));
        servicess.save(new Etudiants(null,"abdo ouabi","abdo@gmail.com", formatter.parse("06/09/1995"),10));
        servicess.save(new Etudiants(null,"brahim ouabi","brahim@gmail.com", formatter.parse("06/09/1994"),280));
        //servicess.findAll().forEach(etudiants -> System.out.println(etudiants.toString()));
    }

}
