package com.mycompany.numeronegativo;

import java.util.Scanner;

public class NumeroNegativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        
        while (a>=0){
            System.out.println("digite otro número entero o un negativo para salir");
            a = entrada.nextInt();
        }
        System.out.println("saliendo");
    }
}
