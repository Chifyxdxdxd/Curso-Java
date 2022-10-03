package com.mycompany.contarhastanegativo;

import java.util.Scanner;

public class ContarHastaNegativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=0;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        
        while (a>=0){
            System.out.println("digite otro número entero o un negativo para salir");
            a = entrada.nextInt();
            b++;
        }
        System.out.println("saliendo, el número de veces que se ha introducido números es: " + b);
    }
}
