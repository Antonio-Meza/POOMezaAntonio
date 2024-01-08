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
public class triangulo {
    int base;
    int altura;
    public triangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
        
    }
    
    public int get_base(){
        return base;
        
    }
    
    public int get_altura(){
        return altura;
    }
    public void setear(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void graficar (Graphics Cl, triangulo tri, int x, int y){
        int x1 []= {x, x-(tri.get_base()/2)*3,x+(tri.get_base()/2)*3};
        int y1 []= {y, y+(tri.get_altura())*3,y+(tri.get_altura())*3};
        Cl.setColor(Color.orange);
        Cl.fillPolygon(x1, y1, 3);
    }
    
    public double area(int base, int altura){
        return (base*altura)/2;
    }
}
