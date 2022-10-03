package com.mycompany.sumanumeros;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=0;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        b+=a;
        
        while (a!=0){
            System.out.println("digite otro número entero o cero (0) para salir");
            a = entrada.nextInt();
            b+=a;
        }
        System.out.println("saliendo, la suma de todos los números es: " + b);
    }
}
