package com.mycompany.tablamultiplicacion;

import java.util.Scanner;

public class TablaMultiplicacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        
        System.out.println("Ingrese un número del 0 al 10");
        a = entrada.nextInt();
        
        System.out.println("la tabla de multiplicar del " + a + " es:");
        for (int i = 0; i<=10;i++){
            System.out.println(a + " x " + i + " = " + (a*i));
        }

    }
}
