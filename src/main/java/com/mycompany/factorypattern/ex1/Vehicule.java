/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex1;

/**
 *
 * @author Amine Ferradj
 */
public  class Vehicule {
    protected double vitesse = 0;
    protected double vitesseMax;
    protected double longueur;

    public Vehicule(double longueur, double vitesseMax) {
        this.longueur = longueur;
        this.vitesseMax = vitesseMax;
    }

    public double getVitesse() {
        return vitesse;
    }

    public double getLongueur() {
        return longueur;
    }

    public void accelerer(double deltaV) {
        vitesse = Math.min(vitesse + deltaV, vitesseMax);
    }

    public void decelerer(double deltaV) {
        vitesse = Math.max(vitesse - deltaV, 0);
    }

    @Override
    public String toString() {
        return "Véhicule [longueur=" + longueur + ", vitesseMax=" + vitesseMax + "km/h, vitesse =" + vitesse + "km/h]";
    }
}
