package com.mycompany.calcularmedia;

import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=0, c=1;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();       
        
        while (a>=0){
            c++;
            b+=a;
            System.out.println("digite otro número entero o un negativo para salir");
            a = entrada.nextInt();
        }

        a = b/c;
        System.out.println("saliendo, la media de todos los números es: " + a);
    }
}
