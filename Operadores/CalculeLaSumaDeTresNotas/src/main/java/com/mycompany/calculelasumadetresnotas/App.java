package com.mycompany.calculelasumadetresnotas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        
        System.out.println("what are the 3 notes?:");
        nota = entrada.nextFloat();
        nota += entrada.nextFloat();
        nota += entrada.nextFloat();
        
        System.out.println("la nota final es: " + nota);
    }
}
