/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa3;

import java.awt.*;
/**
 *
 * @author AntonioMeza
 */
public class cuadrado {
    int lado;
    public cuadrado (int lado){
        this.lado=lado;
    }
    
    public int get_lado(){
        return lado;
    }
    public void setear(int lado){
        this.lado=lado;
    }
    public void graficar (Graphics Cl, cuadrado cu, int x, int y){
        Cl.setColor(Color.LIGHT_GRAY);
        Cl.fillRect(x, y, cu.get_lado()*2, cu.get_lado()*2);
    }
    
    public double area(cuadrado cu){
        return cu.get_lado()*cu.get_lado();
    }
}


