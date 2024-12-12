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


    public static void  main(String[]args){
        Personnage monPersonnage = new Personnage() ;


        monPersonnage.tourner(1);

        System.out.println( monPersonnage.tourner(1));
    }

}
