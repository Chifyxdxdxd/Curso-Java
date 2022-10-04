package com.mycompany.desplazararreglo;

import java.util.Scanner;

/**
 * Diseñar una aplicación que declare una tabla de 10 elementos
 * enteros. Leer mediante el teclado 8 números y una posición.
 * Despues se debe pedir un número y una posición, insertarlo
 * en la posición indicada, desplazando los que estén detrás
 */
public class DesplazarArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ar = new int[10];
        int pos, num;
        
        // llenar el arreglo
        for (int i = 0; i < ar.length-2; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }
        
        //preguntar Posición y número
        System.out.println("que numero deséa agregar al arreglo?");
        num = entrada.nextInt();
        System.out.println("en que posición lo va a agregar");
        pos = entrada.nextInt();
        
        //agregar el numero al arreglo
        for (int i = 7; i>=pos; i--) {
            ar[i+1] = ar [i];
            if (i==pos) ar[i]=num;
        }
        
        //imprimir el arreglo
        System.out.print("\nEl arreglo es:\n[ ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("]");
        
    }
}
