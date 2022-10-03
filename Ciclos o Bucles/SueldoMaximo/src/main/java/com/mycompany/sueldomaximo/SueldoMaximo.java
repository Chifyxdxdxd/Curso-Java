package com.mycompany.sueldomaximo;

import java.util.Scanner;

public class SueldoMaximo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nSueldos;
        float sueldoMax=0, sueldo;
        
        System.out.println("Cual es la cantidad de sueldos?");
        nSueldos = entrada.nextInt();
        
        for (int i=1; i<=nSueldos;i++){
            System.out.println("valor del sueldo numero " + i);
            sueldo = entrada.nextInt();
            
            if (sueldo>sueldoMax)sueldoMax=sueldo;
        }
        
        System.out.println("El valor del mayor sueldo es " + sueldoMax);  
    }
}
