package com.mycompany.notafinal;

import java.util.Scanner;

public class NotaFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        
        System.out.println("Digite las notas en orden: ");
        nota =  (entrada.nextFloat() / 10);
        nota += (entrada.nextFloat() / 4);
        nota += (entrada.nextFloat() / 4);
        nota += (entrada.nextFloat() / 10) * 4;
        
        System.out.println("La nota final es :" + nota);
    }
}
