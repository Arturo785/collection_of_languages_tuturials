package com.example.myPackage;
import clases.Persona;
import clases.Caja;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caja box = new Caja(2,3,6);

      //  System.out.println("El volumen de la caja es: " + box.getVolume());

        var x = 10;
        System.out.println("valor original " + x);
        pasoPorValor(x);
        System.out.println("valor despues funcion " + x);

        System.out.println("Alto de la caja antes de funcion " + box.getAlto());
        pasoPorReferencia(box);
        System.out.println("Alto de la caja despues de funcion " + box.getAlto());


    }

    //El paso por valor se realiza en los tipos de datos primitivos los cuales solo entregan una copia
    public static void pasoPorValor(int valor1){
        System.out.println("valor pasado " + valor1);
        valor1 = 5;
        System.out.println("valor nuevo " + valor1);
        // con return valor1 y reasignar se resuelve ese problema

    }

    public static void pasoPorReferencia(Caja caja){
        caja.setAlto(20);
    }

}








