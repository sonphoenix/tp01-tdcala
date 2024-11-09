/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex2;

/**
 *
 * @author Amine Ferradj
 */
public class Fabrique3D implements FabriqueJoueurs {
    @Override
    public Gardien creerGardien() {
        return new Gardien3D();
    }

    @Override
    public Arriere creerArriere() {
        return new Arriere3D();
    }

    @Override
    public Demi creerDemi() {
        return new Demi3D();
    }

    @Override
    public Avant creerAvant() {
        return new Avant3D();
    }
}