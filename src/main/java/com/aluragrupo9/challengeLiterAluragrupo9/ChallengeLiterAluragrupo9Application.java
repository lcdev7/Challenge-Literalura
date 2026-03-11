package com.aluragrupo9.challengeLiterAluragrupo9;

import com.aluragrupo9.challengeLiterAluragrupo9.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiterAluragrupo9Application {

    public static void main(String[] args) {

        SpringApplication.run(ChallengeLiterAluragrupo9Application.class, args);

        Principal principal = new Principal();
        principal.muestraMenu();
    }
}