package com.mycompany.operacionaritmetica;

import java.util.Scanner;

public class OperacionAritmetica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char x;
        int a, b, re;
        
        System.out.println("Ingrese el primer número: ");
        a = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b = entrada.nextInt();
        
        System.out.println("que operación desea realizar?(s,r,m,d)");
        x = entrada.next().charAt(0);
        
        switch (x){
            case 's','S' ->{
                re = a+b; 
                System.out.println("la suma de los números es: " + re);
            }
            case 'r','R' ->{
                re = a-b;
                System.out.println("la resta de los números es: " + re);
            }
            case 'm','M' ->{
                re = a*b;
                System.out.println("la multiplicación de los números es: " + re);
            }
            case 'd', 'D' ->{
                re = a/b;
                System.out.println("la división de los números es: " + re);
            }
            default -> System.out.println("error, código equivocado");
        }
        
    }
}
