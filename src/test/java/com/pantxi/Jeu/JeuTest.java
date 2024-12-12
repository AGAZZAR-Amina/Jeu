package com.pantxi.Jeu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JeuTest{
    Personnage monPersonnage = new Personnage();

@Test

public void  TestTourner(){
    assertEquals("Le personnage tourne .",   monPersonnage.tourner(1));
    assertEquals("Le personnage tourne .",   monPersonnage.tourner(-1));
    assertEquals("Direction inconnue.", monPersonnage.tourner(0));



}
}
