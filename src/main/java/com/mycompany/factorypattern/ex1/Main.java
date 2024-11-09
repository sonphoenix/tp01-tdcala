/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex1;

/**
 *
 * @author Amine Ferradj
 */
public class Main {
    public static void main(String[] args) {
        Vehicule voiture = VehiculeFactory.creerVehicule("voiture");
        Vehicule bus = VehiculeFactory.creerVehicule("bus");
        Vehicule bicyclette = VehiculeFactory.creerVehicule("bicyclette");

        voiture.accelerer(50);
        bus.accelerer(30);
        bicyclette.accelerer(10);

        System.out.println(voiture);
        System.out.println(bus);
        System.out.println(bicyclette);
        
        System.out.println("creation de parc automobile");
        Vehicule v1=VehiculeFactory.creerVehicule("voiture");
        Vehicule v2=VehiculeFactory.creerVehicule("voiture");
        Vehicule v3=VehiculeFactory.creerVehicule("voiture");
        Vehicule v4=VehiculeFactory.creerVehicule("voiture");
        Vehicule v5=VehiculeFactory.creerVehicule("voiture");
        
        Vehicule b1=VehiculeFactory.creerVehicule("bus");
        Vehicule b2=VehiculeFactory.creerVehicule("bus");
        Vehicule b3=VehiculeFactory.creerVehicule("bus");
        
        Vehicule bi1=VehiculeFactory.creerVehicule("bicyclette");
        Vehicule bi2=VehiculeFactory.creerVehicule("bicyclette");
    }
}
