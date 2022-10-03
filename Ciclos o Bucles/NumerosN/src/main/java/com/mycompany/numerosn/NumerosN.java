package com.mycompany.numerosn;

import java.util.Scanner;

public class NumerosN {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        
        for (int i = 0; i<=a;i++){
            System.out.println(i);
        }
    }
}
