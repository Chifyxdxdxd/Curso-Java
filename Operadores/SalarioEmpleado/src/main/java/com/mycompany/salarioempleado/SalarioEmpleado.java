package com.mycompany.salarioempleado;

import java.util.Scanner;

public class SalarioEmpleado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        float salario, total;
        
        System.out.println("Cual fue la cantidad de horas en la semana?");
        horas = entrada.nextInt();
        System.out.println("Cual es el salario del empleado?");
        salario = entrada.nextFloat();
        
        total = salario * horas;
        System.out.println("el salario de esta semana es de :" + total);
    }
}
