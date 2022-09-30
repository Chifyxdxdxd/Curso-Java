package com.mycompany.mayormenorigual;

import java.util.Scanner;

public class MayorMenorIgual {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x, y;
        
        System.out.println("Cual es el primer número?");
        x = entrada.nextFloat();
        System.out.println("Cual es el segundo número?");
        y = entrada.nextFloat();
        
        if(x>y){
            System.out.println("El primer número es mayor");
        }else if(x<y){
            System.out.println("el segundo número es mayor");
        }else{
            System.out.println("son iguales");
        }
    }
}
