package com.uisrael.lab2;
import java.util.Scanner;
/**
 *
 * @author Antonio Meza
 */
public class Cuenta {
/*ATRIBUTOS*/
    private int numero; //numero de la cuenta
    private char tipo; //ahorro: 'a', corriente: 'c',
    private double saldo; //valor en $ 
/*METODOS*/
    public void mostrarCuenta(){
        System.out.println("Cuenta No: "+this.numero+"Tipo: "+this.tipo+"Saldo: $"+this.saldo);
    }

    //CONTRUCTOR SIN ARGUMENTOS
    public Cuenta(){
        this.numero=1000;
        this.tipo='a';
        this.saldo=50;
    }

    //CONTRUCTOR CON 3 ARGUMENTOS
    public Cuenta(int numero, char tipo, double saldo) {
        this.numero= numero;
        this.tipo= tipo;
        this.saldo= saldo;
    }
   
//Creamos el metodo para ingresar datos de la cuenta desde el teclado
    public static Cuenta ingresarCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese No de Cuenta: ");
        int numero = scanner.nextInt();

        System.out.println("Ingrese Tipo de Cuenta: ");
        char tipo = scanner.next().charAt(0);

        System.out.println("Ingrese el Saldo de la Cuenta: $");
        double saldo = scanner.nextDouble();

//Crear y Devuelve la Instancia de la clase Cuenta con los datos ingresados
        return new Cuenta(numero, tipo, saldo);
    }

    public static void main(String[] args) {
//Llamamos al metodo ingresarCuenta para obtener una nueva Instancia
        Cuenta cuenta = ingresarCuenta();

//Mostrar los datos de la Cuenta
        cuenta.mostrarCuenta();
    }

    
}


