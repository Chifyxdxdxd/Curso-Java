package com.mycompany.sumacuadrados;

import java.util.Scanner;

public class SumaCuadrados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b, re;
        
        System.out.println("Digite el primer número:");
        a = entrada.nextFloat();
        System.out.println("Digite el segundo número:");
        b = entrada.nextFloat();
        
        re = (a * a) + (2 * a * b) + (b * b);
        
        System.out.println("El resultado es: " + re);       
    }
}
