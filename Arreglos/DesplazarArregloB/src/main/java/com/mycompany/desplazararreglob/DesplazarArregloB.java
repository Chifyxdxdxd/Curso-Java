package com.mycompany.desplazararreglob;

import java.util.Scanner;

/**
 * Crear un prigrama que lea por teclado una tabla de 10 números enteros
 * y la desplace una psocición hacia abajo: el primero pasa a ser e segundo,
 * el segundo a ser el tercero, etc. el últmo pasa a ser el primero 
 */
public class DesplazarArregloB {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ar = new int[10];
        int num;
        
        // llenar el arreglo
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextInt();
        }
               
        //desplazar el arreglo
        num = ar[9];
        for (int i = 8; i>=0; i--) {
            ar[i+1] = ar [i];
        }
        ar[0]= num;
        
        //imprimir el arreglo
        System.out.print("\nEl arreglo es:\n[ ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("]");
    }
}
