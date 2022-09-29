package com.mycompany.horasadias;

import java.util.Scanner;

public class HorasADias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas, semanas, dias;
        
        System.out.println("Cuantas horas son en total?");
        horas = entrada.nextInt();
        
        semanas = horas / 168;
        horas -= semanas * 168; 
        dias = horas / 24;
        horas -= dias * 24;
        
        System.out.println("\n\nSemanas: " + semanas + "\nDías: " + dias + 
                "\nHoras: " + horas);
    }
}
