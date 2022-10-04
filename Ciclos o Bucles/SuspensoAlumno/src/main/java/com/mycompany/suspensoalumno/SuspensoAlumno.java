package com.mycompany.suspensoalumno;

import java.util.Scanner;

public class SuspensoAlumno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n;
        boolean sus=false;
        
        for (int i=1; i<=5;i++){
            System.out.println("Digite la nota del alumno 0-10 " + i);
            n = entrada.nextFloat();
            
            if (n<6)sus=true;
        }
        
        if(sus){
            System.out.println("Un alumno o más han suspendido");
        }else{
            System.out.println("Ningun alumno ha suspendido");
        }
    }
}
