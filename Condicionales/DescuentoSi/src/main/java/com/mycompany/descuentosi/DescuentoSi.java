package com.mycompany.descuentosi;

import java.util.Scanner;

public class DescuentoSi {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x;
        
        System.out.println("Cual es el precio de compra?");
        x = entrada.nextFloat();
        
        if(x>=300){
            System.out.println("El total a pagar es: " + x);
        }else{
            x *= 8/10; 
            System.out.println("El total a pagar es: " + x);
        }
    }
}
