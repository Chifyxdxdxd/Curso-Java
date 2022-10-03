package com.mycompany.sumadiez;

import java.util.Scanner;

public class SumaDiez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=0;

        for (int i = 0; i<=10;i++){
            System.out.println("digite un número entero");
            a = entrada.nextInt();
            b += a;
        }
        
        System.out.println("la suma de los números es: " + b);
    }
}
