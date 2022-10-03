package com.mycompany.paroimpar;

import java.util.Scanner;

public class ParOImpar {
    /*
    public static void confirmaciónPar(int a){
        if ((a%2)==0){
            System.out.println("el número es par");
        }else{
            System.out.println("el número es impar");
        }
    }
    */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        
        System.out.println("digite un número entero");
        a = entrada.nextInt();
        //confirmaciónPar(a);
        
        while (a!=0){
            if ((a%2)==0){
                System.out.println("el número es par");
            }else{
                System.out.println("el número es impar");
            }
            System.out.println("digite otro número entero o cero para salir");
            a = entrada.nextInt();
            //confirmaciónPar(a);
        }
        System.out.println("saliendo");
    }
}
