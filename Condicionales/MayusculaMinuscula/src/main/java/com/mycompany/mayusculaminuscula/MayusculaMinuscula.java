package com.mycompany.mayusculaminuscula;

import java.util.Scanner;

public class MayusculaMinuscula {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char x;
        
        System.out.println("Escriba la letra: ");
        x = entrada.next().charAt(0);
    
        if(Character.isLowerCase(x)){
            System.out.println("la letra es minuscula");
        }else {
            System.out.println("la letra es mayuscula");
        }
    }
}
