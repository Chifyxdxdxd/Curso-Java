package com.mycompany.promedioarreglo;

import java.util.Scanner;

/**
 * Leer 5 números por teclado, almacenarlos en un arreglo
 * y a continuación realizar la media de los numeros positivos,
 * la media de los negativos y contar el número de ceros
 */
public class PromedioArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int p=0, ce=0, n=0;
        float b=0, c=0;
        float[] ar = new float[5];
        
        for (int i=0; i<5; i++){
            System.out.println("Escribe el numero " + (i+1) + " del arreglo");
            ar[i] = entrada.nextFloat();
            if (ar[i]==0){
                ce++;
            }else if (ar[i]<0){
                n++;
                c+=ar[i];
            } else {
                p++;
                b+=ar[i];
            }
        }
       
        if (n!=0)c = c/n;
        if (p!=0)b = b/p;
        System.out.println("La media de los números positivos es: " + b +
                    "\nLa media de los números negativos es: " + c + 
                    "\nLa cantidad de ceros es: " + ce);
    }
}
