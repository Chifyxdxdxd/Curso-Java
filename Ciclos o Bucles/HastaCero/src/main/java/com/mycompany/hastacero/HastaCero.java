package com.mycompany.hastacero;

import java.util.Scanner;

public class HastaCero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        
        while (a==0){
            System.out.println("digite otro número entero o cero para salir");
            a = entrada.nextInt();
        }
        System.out.println("saliendo");
    }
}
