/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex2;

/**
 *
 * @author Amine Ferradj
 */
public class Terrain {
    private FabriqueJoueurs fabrique;

    public Terrain(FabriqueJoueurs fabrique) {
        this.fabrique = fabrique;
    }

    public void creerEquipe() {
        Joueur gardien = fabrique.creerGardien();
        Joueur arriere1 = fabrique.creerArriere();
        Joueur arriere2= fabrique.creerArriere();
        Joueur arriere3 = fabrique.creerArriere();
        Joueur demi1 = fabrique.creerDemi();
         Joueur demi2 = fabrique.creerDemi();
          Joueur demi3 = fabrique.creerDemi();
           Joueur demi4 = fabrique.creerDemi();
        Joueur avant1 = fabrique.creerAvant();
        Joueur avant2 = fabrique.creerAvant();
         Joueur avant3 = fabrique.creerAvant();


        gardien.afficher();
        arriere1.afficher();
        arriere2.afficher();
        arriere3.afficher();
        demi1.afficher();
        demi2.afficher();
        demi3.afficher();
        demi4.afficher();
        avant1.afficher();
        avant2.afficher();
        avant3.afficher();



    }
}
