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
public class circulo {
    
    int radio;
    
    public circulo(int radio){
        this.radio=radio;
    }
    
    public int get_radio(){
        return radio;
    }
    public void setear(int radio){
        this.radio=radio;
    }
    
    public void graficar(Graphics Cl, circulo cl, int x, int y){
        Cl.setColor(Color.yellow);
        Cl.fillOval(x, y, cl.get_radio()*4, cl.get_radio()*4);
    }
    
    public double area(circulo cl){
        return 3.1416*cl.get_radio()*cl.get_radio();
    }
}
