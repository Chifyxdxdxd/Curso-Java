package com.mycompany.arreglocreciente;

import java.util.Scanner;

/**
 * Leer por teclado una serie de 10 números enteros.
 * La aplicación debe indicarnos si los números estan
 * de forma creciente, decreciente o si estan desordenados 
 */
public class ArregloCreciente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] ar = new float[10];
        boolean cre = false, dec = false;
        
        // llenar el arreglo
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + " del arreglo");
            ar[i] = entrada.nextFloat();
        }
        
        //comparar números
        for (int i = 1; i < ar.length; i++) {
            if (ar[1]< ar[1-1])dec=true;
            if (ar[1]> ar[1-1])cre=true;
        }
        
        //indica la salida
        if(cre==true && dec==false){
            System.out.println("El arreglo esta ordenado creciente");
        }else if (cre==false && dec==true){
            System.out.println("El arreglo esta ordenado decreciente");
        }else if (cre==dec){
            System.out.println("El arreglo esta desordenado");
        }
    }
}
