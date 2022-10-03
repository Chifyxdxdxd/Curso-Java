package com.mycompany.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=1;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        
        for (int i = a; i>0;i--){
            b*=i;
        }
        
        System.out.println("el factorial es: " + b);
    }
}
