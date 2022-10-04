package com.mycompany.desplazararregloc;

import java.util.Scanner;

/**
 * Crear un progrma que lea por teclado una tabla de 10 números
 * enteros y desplace N posiciones el arreglo.
 * N es digitado por el usuaro.
 */
public class DesplazarArregloC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ar = new int[10];
        int num, pos;
        
        // llenar el arreglo
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }
        
        //preguntar Posición
        System.out.println("Cauntas posiciones va a desplazar?");
        pos = entrada.nextInt();
               
        //desplazar el arreglo
        for (int j = 0; j < pos; j++) {
            num = ar[9];
            for (int i = 8; i>=0; i--) {
                ar[i+1] = ar [i];
            }
            ar[0]= num;
        }
        
        
        //imprimir el arreglo
        System.out.print("\nEl arreglo es:\n[ ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("]");
    }
}
