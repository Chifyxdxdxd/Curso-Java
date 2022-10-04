package com.mycompany.adivinarnumero;

import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c=0;
         
        a = (int)(Math.random()*101);
        
        System.out.println("digite un número entero entre 0 y 100");
        b = entrada.nextInt();
        
        while (a!=b){
            System.out.println("digite otro número entero entre 0 y 100");
            b = entrada.nextInt();
            c++;
        }
        
        System.out.println("Correcto, el número de intentos fue: " + c);
    }
}
