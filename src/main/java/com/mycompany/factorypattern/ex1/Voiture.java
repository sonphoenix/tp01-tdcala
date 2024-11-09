/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex1;

/**
 *
 * @author Amine Ferradj
 */
public class Voiture extends Vehicule {
    public Voiture() {
        super(6, 120);
    }

    @Override
    public String toString() {
        return "Voiture: " + super.toString();
    }
}