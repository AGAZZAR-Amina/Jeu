package com.pantxi.Jeu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class JeuTest{

    Personnage monPersonnage = new Personnage();

    // Méthode exécutée avant chaque test
    @BeforeEach
    public void setUp() {
        // Initialisation des objets ou des valeurs communes à tous les tests
        monPersonnage = new Personnage();
        System.out.println("Initialisation avant chaque test");
    }

    // Méthode exécutée après chaque test
    @AfterEach
    public void tearDown() {
        // Nettoyage après chaque test (facultatif)
        System.out.println("Nettoyage après chaque test");
    }

@Test

public void  TestTourner1(){
    assertEquals("Est",   monPersonnage.tourner(1));
    assertEquals("Nord",   monPersonnage.tourner(-1));
    assertEquals("Nord", monPersonnage.tourner(0));
}
}






