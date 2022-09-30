package com.mycompany.cajeroautomatico;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c=1000;

        System.out.println("""
                           Que transacion desea realizar?
                           1. Ingresar dinero a la cuenta.
                           2. Retiar dinero de la cuenta.
                           3. Salir""");
        a = entrada.nextInt();
               
        switch (a){
            case 1->{
                System.out.println("Cuanto dinero desea ingresar?");
                a = entrada.nextInt();
                c += a;
                System.out.println("su saldo en la cuenta es de: " + c);
            }
            case 2 ->{
                System.out.println("Cuanto dinero desea retirar?");
                a = entrada.nextInt();
                c -= a;
                if(c<0){
                    System.out.println("su saldo en la cuenta no es suficiente");
                }else{
                    System.out.println("su saldo en la cuenta es de: " + c);
                }
            }
            default -> System.out.println("saliendo");
        }
    }
}
