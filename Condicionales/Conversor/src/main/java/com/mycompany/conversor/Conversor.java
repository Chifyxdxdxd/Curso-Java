package com.mycompany.conversor;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b;
        int x;

        System.out.println("Cuantos Kg son?");
        a = entrada.nextFloat();
        System.out.println("""
                           A que medida deséa convertir?
                           1. Toneladas
                           2. miligramos
                           3. libras
                           4. onzas
                           """);
        x = entrada.nextInt();
        
        switch (x){
            case 1 ->{
                b = a/1000;
                System.out.println(a + " kilogramos son " + b + " toneladas");
            }
            case 2 ->{
                b = a*1000000;
                System.out.println(a + " kilogramos son " + b + " miligramos");
            }
            case 3 ->{
                b = a*100000/45359;
                System.out.println(a + " kilogramos son " + b + " libras");
            }
            case 4 ->{
                b = a*100000/2835;
                System.out.println(a + " kilogramos son " + b + " onzas");
            }
            default -> System.out.println("error, numero invalido");
        }
    }
}
