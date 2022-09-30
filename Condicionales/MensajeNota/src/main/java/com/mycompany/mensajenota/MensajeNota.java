package com.mycompany.mensajenota;

import java.util.Scanner;

public class MensajeNota {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;

        System.out.println("Cual es la nota?(de 0 a 10)");
        a = entrada.nextInt();
               
        switch (a){
            case 0,1,2 ->{
                System.out.println("Insuficiente");
            }
            case 4,3 ->{
                System.out.println("Suficiente");
            }
            case 6,5 ->{
                System.out.println("Bien");
            }
            case 8,7 ->{
                System.out.println("Notable");
            }
            case 10,9 ->{
                 System.out.println("Sobresaliente");
            }
            default -> System.out.println("error, numero invalido");
        }
    }
}
