package com.mycompany.ecuaciongrado2;

import java.util.Scanner;

public class EcuacionGrado2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, x1, x2;
        
        System.out.println("Digite el valos de A, B y C:");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        x1 = (-b + Math.sqrt((b*b) - (4*a*c))) / (2*a);
        x2 = (-b - Math.sqrt((b*b) - (4*a*c))) / (2*a);
        
        System.out.println("La primera solución es: " + x1 + "\nLa segunda "
                + "solución es: " + x2);
    }
}
