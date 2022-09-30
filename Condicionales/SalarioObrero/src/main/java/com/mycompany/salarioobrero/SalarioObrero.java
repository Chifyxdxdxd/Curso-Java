package com.mycompany.salarioobrero;

import java.util.Scanner;

public class SalarioObrero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, a;
        
        System.out.println("Cuantas horas trabajó el obrero?");
        x = entrada.nextInt();
        
        if(x>40){
            a = x - 40;
            x = a*20 + 40*16;
            System.out.println("El saladio del obrero es: " + x);
        }else{
            x *= 16;
            System.out.println("El saladio del obrero es: " + x);
        }
    }
}
