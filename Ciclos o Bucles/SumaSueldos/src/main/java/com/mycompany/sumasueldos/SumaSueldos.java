package com.mycompany.sumasueldos;

import java.util.Scanner;

public class SumaSueldos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=0, c=0;

        for (int i = 0; i<10;i++){
            System.out.println("Digite el salario del empleado " + (i+1));
            a = entrada.nextInt();
            b += a;
            if (a>1000)c++;
        }
        
        System.out.println("la suma de los sueldos es: " + b +"$\nHay " + c + 
                " salarios que superan los 1000$");
    }
}
