/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex1;

/**
 *
 * @author Amine Ferradj
 */
public class VehiculeFactory {
    public static Vehicule creerVehicule(String type) {
        switch (type) {
            case "voiture" -> {
                return new Voiture();
            }
            case "bus" -> {
                return new Bus();
            }
            case "bicyclette" -> {
                return new Bicyclette();
            }
            default -> throw new IllegalArgumentException("Type de véhicule inconnu: " + type);
        }
    }
}

