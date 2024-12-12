package com.pantxi.Jeu;

public class Personnage {

    public static String[] Orientation = {"Nord", "Est", "Sud", "Ouest"};
    public int orientationActuelle;

    Personnage() {
        this.orientationActuelle = 0;

    }

    public String tourner(int pas) {
        if (pas < 0) {
            throw new IllegalArgumentException("le nombre doit etre positif.");
        }

        orientationActuelle = orientationActuelle + pas;

        return Orientation[orientationActuelle];
    }

    public String tourner1(int pas) {
        if (pas < 0 || pas>4 ) {
            throw new IllegalArgumentException("le nombre doit etre positif.");

        }
        if(orientationActuelle+pas<4) {
            orientationActuelle = orientationActuelle + pas;
        }
        else{
            orientationActuelle = (orientationActuelle+ pas)-4;
        }


        return Orientation[orientationActuelle];

    }
}