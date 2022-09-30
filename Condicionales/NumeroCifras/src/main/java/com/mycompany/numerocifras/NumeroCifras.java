package com.mycompany.numerocifras;

import java.util.Scanner;

public class NumeroCifras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x;
        
        System.out.println("Ingrese un número entre 0 y 99.999:");
        x = entrada.nextFloat();
        
        if(x<100000){
            System.out.println("El número tiene 5 cifras");
        }else if(x<10000){
            System.out.println("El número tiene 4 cifras");    
        }else if(x<1000){
            System.out.println("El número tiene 3 cifras");    
        }else if(x<100){
            System.out.println("El número tiene 2 cifras");    
        }else if(x<10){
            System.out.println("El número tiene 1 cifras");    
        }    
    }
}
