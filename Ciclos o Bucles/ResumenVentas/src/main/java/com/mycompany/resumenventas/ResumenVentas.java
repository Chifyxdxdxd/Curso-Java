package com.mycompany.resumenventas;

import java.util.Scanner;

public class ResumenVentas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cod, n600=0;
        float li, liv=0, fact = 0, fac;

        for (int i = 1; i<=5;i++){
            System.out.println("Digite el codigo de la factura " + i);
            cod = entrada.nextInt();
            System.out.println("Digite la cantidad de litros de la factura " + i);
            li = entrada.nextFloat();
            System.out.println("Digite el precio por litro de la factura " + i);
            fac = entrada.nextFloat();
            
            fact= li*fac;
            if(cod==1)liv += li;
            if((fac*li)>600)n600++;
        }
        System.out.println("la Facturación total fue de: " + fact + 
                "\nLos litros vendidos del producto 1 son " + liv +
                "\nLa cantidad de facturas emitidas por más de $600 es " + n600);
    }
}
