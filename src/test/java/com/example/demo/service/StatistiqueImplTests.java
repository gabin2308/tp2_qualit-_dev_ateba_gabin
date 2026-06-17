package com.example.demo.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.example.demo.data.Voiture;

public class StatistiqueImplTests {

    @Test
    void testCalculerMoyenne() {
       
        StatistiqueImpl statistique = new StatistiqueImpl();
            Voiture voiture1 = new Voiture("Toyota", 10000);
            Voiture voiture2 = new Voiture("Honda", 15000);
            Voiture voiture3 = new Voiture("Ford", 20000);
    
            statistique.ajouter(voiture1);
            statistique.ajouter(voiture2);
            statistique.ajouter(voiture3);
    
            Echantillon echantillon = statistique.prixMoyen();
    
            assertEquals(3, echantillon.getNombreDeVoitures());
            assertEquals(15000, echantillon.getPrixMoyen());

    }

    @Test
    void voitureVide() {
        StatistiqueImpl statistique = new StatistiqueImpl();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            statistique.prixMoyen();
        });
    
        assertEquals("/ by zero", exception.getMessage()); 
    }
}