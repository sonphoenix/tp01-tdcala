
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex2;

/**
 *
 * @author Amine Ferradj
 */
public class BabyFoot {
    public static void main(String[] args) {
        FabriqueJoueurs fabrique2D = new Fabrique2D();
        FabriqueJoueurs fabrique3D = new Fabrique3D();

        System.out.println("Équipe 2D:");
        Terrain terrain2D = new Terrain(fabrique2D);
        terrain2D.creerEquipe();

        System.out.println("\nÉquipe 3D:");
        Terrain terrain3D = new Terrain(fabrique3D);
        terrain3D.creerEquipe();
    }
}

