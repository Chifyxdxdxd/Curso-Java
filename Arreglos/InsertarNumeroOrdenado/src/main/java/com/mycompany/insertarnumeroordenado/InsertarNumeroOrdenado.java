package com.mycompany.insertarnumeroordenado;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
 * Éstos los guardaremos en una tabla de tamaño 10. Leer un número N
 * e insertarlo en el lugar adecuado para que la tabla contenúe ordenada. 
 */
public class InsertarNumeroOrdenado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ar = new int[10];
        int num, pos=0;
        boolean cre=true;
        
        // llenar el arreglo
        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe el numero " + (i + 1) + 
                    " del arreglo");
            ar[i] = entrada.nextInt();
        }
        sort(ar);
        
        //preuntar el número
        System.out.println("cual es el número que desea agregar?");
        num = entrada.nextInt();
        
                       
        //desplazar el arreglo
        do{
            if (num<ar[pos] && num>ar[pos-1]){
                
            
            num = ar[9];
            for (int i = 8; i>=0; i--) {
                ar[i+1] = ar [i];
            }
            ar[0]= num;
            }pos++;
        }while (num<ar[pos]);
        
        
        //imprimir el arreglo
        System.out.print("\nEl ahora es arreglo es:\n[ ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("]");
    }
}
