/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex2;

/**
 *
 * @author Amine Ferradj
 */
public interface FabriqueJoueurs {
    Gardien creerGardien();
    Arriere creerArriere();
    Demi creerDemi();
    Avant creerAvant();
}

