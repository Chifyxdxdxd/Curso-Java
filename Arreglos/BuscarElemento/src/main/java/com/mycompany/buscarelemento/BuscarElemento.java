package com.mycompany.buscarelemento;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se
 * debe mostrar la posición n que se encuentra. Si no está indicarlo con un
 * mensaje
 */
public class BuscarElemento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ar[] = new int[10];
        int uve, pos = 0;
        boolean xd = false;

        // llenar el arreglo 1
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }
        sort(ar);

        //buscar el numero 
        System.out.println("cual numero quire buscar?");
        uve = entrada.nextInt();

        //buscar el arreglo
        for (int i = 0; i < ar.length; i++) {
            if (uve == ar[i]) {
                xd = true;
                pos = i;
            }
        }

        if (xd) {
            System.out.println("El número se encuentra en la posición: " + pos);
        } else {
            System.out.println("El número no se encuentra en el arreglo :c");
        }
    }
}
