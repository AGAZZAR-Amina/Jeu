package com.pantxi.Jeu;

public class Personnage {

    private static String[] Orientation={"Nord","Est","Sud","Ouest"};
    private int orientationActuelle;

    Personnage(){
        this.orientationActuelle=0 ;

    }

    public String tourner(int pas){
        orientationActuelle=orientationActuelle+pas ;
        return  Orientation[orientationActuelle];
    }


    
}
