package com.mycompany.arreglodesordenado;

import java.util.Scanner;

/**
 * Leer 10 números enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden:
 * primero, último, segundo, penúltimo, etc.
 */
public class ArregloDesordenado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float[] ar = new float[10];
        
        for (int i=0; i<10; i++){
            System.out.println("Escribe el numero " + (i+1) + " del arreglo");
            ar[i] = entrada.nextFloat();
        }
        
        System.out.print("\nEl arreglo desordenado es:\n[ ");
        for (int i=0; i<5; i++){
            System.out.print(ar[i] + " ");    
            System.out.print(ar[9-i] + " ");
        }
        System.out.println("]");
    }
}
