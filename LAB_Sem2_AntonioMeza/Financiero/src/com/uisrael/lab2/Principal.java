package com.uisrael.lab2;

/**
 *
 * @author Antonio Meza
 */
/*
public class Principal {
    
    public static void main(String[] args){
        Cuenta c; //creacion del objeto
        c= new Cuenta(); //instanciacion del objeto
        c.mostrarCuenta(); //llamada al metodo
    }
*/
public class Principal {
    
    public static void main(String[] args){
        
        Cuenta c1= new Cuenta(); //instanciacion del objeto c1 y llamada al constructor
        Cuenta c2= new Cuenta(101,'a',100); //instanciacion del objeto c2 y llamada al constructor
        c1.mostrarCuenta(); //llamada al metodo con el objeto c1
        c2.mostrarCuenta(); //llamada al metodo con el objeto c2
    }
  
}
