package com.mycompany.eliminarelemento;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Leer por teclado una tabla de 10 elementos numéricos enteros y una 
 * posición (entre 0 y 9). Eliminar el elemento situado en la posición 
 * dada sin dejar huecos.
 */
public class EliminarElemento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ar[] = new int[10];
        int xd[] = new int[9];
        int pos;

        // llenar el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }

        //preuntar la posición
        System.out.println("cual es el posición?");
        pos = entrada.nextInt();

        //copiar 
        for (int i = 0; i < xd.length; i++) {
            if (i >= pos) {
                xd[i] = ar[i + 1];
            } else {
                xd[i] = ar[i];
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
