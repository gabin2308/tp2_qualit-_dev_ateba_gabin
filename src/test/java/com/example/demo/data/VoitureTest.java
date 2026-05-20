package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    private final Voiture voiture = new Voiture("gabin", 2000);

    @Test
    void VerifierMarque(){
        assertEquals("gabin",voiture.getMarque() );
    }

}
