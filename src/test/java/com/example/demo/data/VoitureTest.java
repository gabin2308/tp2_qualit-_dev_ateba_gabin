package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {
    Private Voiture voiture1;
    Private Voiture voiture2;



    @Test
    void creerVoiture(){
        voiture1 = new Voiture("Volkwagen", 2000);
        voiture.setId(1);
        voiture2 = new Voiture("Ferrari", 2500);
        voiture2.setId(2);
    }

    @Test
    void VerifierMarque(){
        Assert.isTrue(voiture1.getPrix() == 2000, " Doit etre 3800");
        Assert.isTrue(voiture2.getMarque().equals("Ferrari"), "Doit etre Ferrari");
    }

}
