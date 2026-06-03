package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {
    private Voiture voiture1;
    private Voiture voiture2;



    @BeforeEach
    void creerVoiture(){
        voiture1 = new Voiture("Volkwagen", 2000);
        voiture1.setId(1);
        voiture2 = new Voiture("Ferrari", 2500);
        voiture2.setId(2);
    }

    @Test
    void VerifierMarque(){
        assertEquals("Volkwagen", voiture1.getMarque(), "La marque doit etre Volkwagen");
    }
    @Test
    void VerifierPrix(){
        assertEquals(2000, voiture1.getPrix(), "Doit etre 2000");
    }

}
