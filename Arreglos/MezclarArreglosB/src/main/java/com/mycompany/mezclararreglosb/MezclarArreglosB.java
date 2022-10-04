package com.mycompany.mezclararreglosb;

import java.util.Scanner;

/**
 * Leer por teclado dos tablas de 12 elementos numéricos,
 * y mezclarlas en una tercera de la forma:
 * 3 elementos de A, 3 elementos de B, 3 elementos de A,
 * 3 elementos de B, etc.
 */
public class MezclarArreglosB {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[24];

        System.out.println("Primer arreglo:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            a[i] = entrada.nextInt();
        }

        System.out.println("Segundo arreglo:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            b[i] = entrada.nextInt();
        }

        //mezcla
        for (int i = 0; i < c.length; i += 6) {
            for (int j = 0; j < 3; j++) {
                c[j + i] = a[i / 2];
                c[j + i + 3] = b[i / 2];
            }
        }
        //imprimir
        System.out.print("\nEl tercer arreglo es:\n[ ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");
    }
}
