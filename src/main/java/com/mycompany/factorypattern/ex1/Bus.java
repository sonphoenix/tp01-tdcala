/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern.ex1;

/**
 *
 * @author Amine Ferradj
 */
public class Bus extends Vehicule{
    
  public Bus(){
    super(18,90);
 }
  @Override
  public String toString(){
      return "Bus:"+super.toString();
  }
    
}
