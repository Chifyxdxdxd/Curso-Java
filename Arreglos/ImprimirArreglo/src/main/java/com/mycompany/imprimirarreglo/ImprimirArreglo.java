package com.mycompany.imprimirarreglo;

import java.util.Scanner;

/*
 * Leer 5 números, guardarlos en un arreglo 
 * y mostrarlos en el mismo orden introducido.
 */
public class ImprimirArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float[] ar = new float[5];
        
        for (int i=0; i<5; i++){
            System.out.println("Escribe el numero " + (i+1) + " del arreglo");
            ar[i] = entrada.nextFloat();
        }
        
        System.out.print("\nEl arreglo es:\n[ ");
        for (int i=0; i<5; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println("]");
    }
}
