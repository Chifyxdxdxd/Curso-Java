package com.mycompany.parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x, y;
        
        System.out.println("Ingrese el primer número");
        x = entrada.nextFloat();
        System.out.println("Ingrese el segundo número");
        y = entrada.nextFloat();
        
        if((x%2)==0){
            System.out.println("el primer número es Par.");
        }else {
            System.out.println("el primer número es Impar");
        }if((y%2)==0){
            System.out.println("el segundo número es Par.");
        }else {
            System.out.println("el segundo número es Impar");
        }       
    }
}
