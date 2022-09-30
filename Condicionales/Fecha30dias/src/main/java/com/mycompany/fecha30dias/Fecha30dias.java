package com.mycompany.fecha30dias;

import java.util.Scanner;

public class Fecha30dias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Ingrese el día: ");
        x = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        y = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        z = entrada.nextInt();
        
        if((x<30) && (x>1)){
            System.out.println("día correcto");
        }else {
            System.out.println("día incorrecto");
        }if (y<12 && (y>1)){ 
            System.out.println("mes correcto");
        }else{
            System.out.println("mes incorrecto");
        }if (z != 0){
            System.out.println("año correcto");
        }else {
            System.out.println("año incorrecto");
        }  
    }
}
