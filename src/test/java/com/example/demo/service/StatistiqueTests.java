package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl service = new statistiqueImpl();
    service.ajouter(new Voiture("Renault", 1000));
    service.ajouter(new Voiture("Peugeot", 2000));

    Echantillon echantillon = service.prixMoyen();


    assertEquals(2, echantillon.getNombreDeVoitures());

}
