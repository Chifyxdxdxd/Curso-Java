package com.mycompany.mezclararreglos;

import java.util.Scanner;

/**
 * Leer por teclado dos tablas de 10 números enteros
 * y mezclarlas en una tercera de la forma:
 * 1ºA, 1ºB, 2ºA, 2ºB, etc.
 */
public class MezclarArreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        
        System.out.println("Primer arreglo:");
        for (int i=0; i<10; i++){
            System.out.println("Escribe el numero " + (i+1) + " del arreglo");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Segundo arreglo:");
        for (int i=0; i<10; i++){
            System.out.println("Escribe el numero " + (i+1) + " del arreglo");
            b[i] = entrada.nextInt();
        }
        
        //mezcla
        for (int i=0; i<20; i+=2){
            c[i] = a[i/2];
            c[i+1] = b[i/2];
        }
        //imprimir
        System.out.print("\nEl tercer arreglo es:\n[ ");
        for (int i=0; i<20; i++){
            System.out.print(c[i] + " ");
        }    
        System.out.println("]");
    }
}
