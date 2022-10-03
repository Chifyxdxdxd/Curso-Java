package com.mycompany.notaestudiantes;

import java.util.Scanner;

public class Notaestudiantes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n = 0;
        int a=0, s=0, c=0;
        
        for (int i=0; i<5; i++){
            System.out.println("Digite la nota entre 0 y 10");
            n = entrada.nextInt();
            
            if (n<4)s++;
            if (n==4)c++;
            if (n>4)a++;
        }
        System.out.println("El número de estudiantes suspendidos es " + s +
                    "\nEl número de estudiantes condicionados es " + c +
                    "\nEl número de estudiantes aprovados es " + a);
    }
}
