package com.mycompany.cantidaddinero;

import java.util.Scanner;

public class CantidadDinero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        
        System.out.println("Cuanto dinero tiene Guillermo?:");
        guillermo = entrada.nextFloat();
        
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = luis + juan + guillermo;
        
        System.out.println("La cantidad de dinero es: \nGuillermo: " + guillermo
                + "\nLuis: " + luis + "\nJuan: " + juan + "\nTotal: "+total);
        
    }
}
