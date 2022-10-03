package com.mycompany.edadyaltura;

import java.util.Scanner;

public class EdadYAltura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float b;
        int a, x=0, y=0, xm=0, ym=0;

        for (int i = 1; i<=5;i++){
            System.out.println("Digite la edad del estudiante " + i);
            a = entrada.nextInt();
            System.out.println("Digite la estatura del estudiante " + i);
            b = entrada.nextFloat();
            if (a>18)x++;
            if (b>1.75)y++;
            xm+=a;
            ym+=b;
        }
        
        System.out.println("la edad media de los alumnos es " + xm + 
                "\nLa estatura media de los alumnos es " + ym + 
                "\nHay " + x + " estudiantes mayores de 18 años" +
                "\nY también hay " + y + "que tienen estatura mayor a 1.75m");
    }
}
