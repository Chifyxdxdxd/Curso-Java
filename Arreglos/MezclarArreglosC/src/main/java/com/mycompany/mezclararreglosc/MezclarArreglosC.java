package com.mycompany.mezclararreglosc;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 * Leer dos series de 10 enteros, que estar ordenados crecientemente.
 * Copiar(fusionar) las dos tablas en una tercera, de tal forma que sigan
 * ordenados
 */
public class MezclarArreglosC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ar[] = new int[10];
        int xd[] = new int[10];
        int arxd[] = new int[20];

        // llenar el arreglo 1
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }

        // llenar el arreglo 
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            xd[i] = entrada.nextInt();
        }

        //mezclar arreglos
        for (int i = 0; i < arxd.length; i += 2) {
            arxd[i + 1] = xd[i / 2];
            arxd[i] = ar[i / 2];
        }
        sort(arxd);

        //imprimir el arreglo
        System.out.print("\nEl arreglo combinado es:\n[ ");
        for (int i = 0; i < arxd.length; i++) {
            System.out.print(arxd[i] + " ");
        }
        System.out.println("]");
    }

}
