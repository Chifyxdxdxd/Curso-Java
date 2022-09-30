package com.mycompany.fechanormal;

import java.util.Scanner;

public class FechaNormal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Ingrese el día: ");
        x = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        y = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        z = entrada.nextInt();
        
        if (z != 0){
            switch(y){
                case 1,3,5,7,8,10,12 -> {
                    if ((x<31) && (x>1)){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("error, día incorrecto");
                    }
                }
                case 2 -> {
                    if ((x<28) && (x>1)){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("error, día incorrecto");
                    }
                }
                case 4,6,9,11 -> {
                    if ((x<30) && (x>1)){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("error, día incorrecto");
                    }
                }
                default -> System.out.println("error, mes incorrecto");
            }
        }else {
            System.out.println("error, año incorrecto");
        }
    }
}
