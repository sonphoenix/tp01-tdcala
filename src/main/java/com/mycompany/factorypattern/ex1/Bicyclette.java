/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex1;

/**
 *
 * @author Amine Ferradj
 */

public class Bicyclette extends Vehicule {
    public Bicyclette() {
        super(1.5, 30);
    }

    @Override
    public String toString() {
        return "Bicyclette: " + super.toString();
    }
}
