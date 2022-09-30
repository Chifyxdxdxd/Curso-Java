package com.mycompany.determinarmultiplo;

import java.util.Scanner;

public class DeterminarMultiplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x;
        
        System.out.println("Cual es el número?");
        x = entrada.nextFloat();
        
        if ((x%10)==0){
            System.out.println("El número es multiplo de 10");
        }
        System.out.println("El número NO es multiplo de 10");
    }
}
