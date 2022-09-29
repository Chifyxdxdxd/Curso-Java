package com.mycompany.salariomensual;

import java.util.Scanner;

public class SalarioMensual {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float total, carro;
        int cantidad;
        
        System.out.println("Cuantos carros se vendieron?:");
        cantidad = entrada.nextInt();
        //hace falta un ciclo para hacer bien el ejercicio
        System.out.println("Cual es el valor del carro?:");
        carro = entrada.nextInt();
        
        total = 1000 + (cantidad*150) + (5/100*cantidad*carro);
        
        System.out.println("El salario mensual es: " + total);
    }
}
