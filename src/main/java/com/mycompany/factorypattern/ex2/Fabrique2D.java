/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex2;

/**
 *
 * @author Amine Ferradj
 */
public class Fabrique2D implements FabriqueJoueurs {
    @Override
    public Gardien creerGardien() {
        return new Gardien2D();
    }

    @Override
    public Arriere creerArriere() {
        return new Arriere2D();
    }

    @Override
    public Demi creerDemi() {
        return new Demi2D();
    }

    @Override
    public Avant creerAvant() {
        return new Avant2D();
    }
}