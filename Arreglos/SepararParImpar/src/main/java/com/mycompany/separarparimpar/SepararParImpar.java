package com.mycompany.separarparimpar;

import java.util.Scanner;

/**
 *  Leer 10 enteros en una tabla. Guardar en otra tabla los elementos 
 * pares de la primera, y a continuación los elementos impares
 * 
 */
public class SepararParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ar[] = new int[10];
        int xd[] = new int[10];
        int pos = 0;

        // llenar el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }

        //copiar pares
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                xd[pos] = ar[i];
                pos++;
            }
        }
        //copiar impares
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 1) {
                xd[pos] = ar[i];
                pos++;
            }
        }

        //imprimir el arreglo
        System.out.print("\nEl arreglo ahora es:\n[ ");
        for (int i = 0; i < xd.length; i++) {
            System.out.print(xd[i] + " ");
        }
        System.out.println("]");
    }
}
