package com.mycompany.ordenarnumeros;

import java.util.Scanner;

public class OrdenarNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x, y, z;
        
        System.out.println("Ingrese el primer número");
        x = entrada.nextFloat();
        System.out.println("Ingrese el segundo número");
        y = entrada.nextFloat();
        System.out.println("Ingrese el tercer número");
        z = entrada.nextFloat();
        
        if((x>y) && (y>z)){
            System.out.println("los numeros de mayor a menor son: " + x + ", " +
                    y + ", " + z);
        }else if((x>z) && (z>y)){
            System.out.println("los numeros de mayor a menor son: " + x + ", " +
                    z + ", " + y);
        }else if((y>z) && (z>x)){
            System.out.println("los numeros de mayor a menor son: " + y + ", " +
                    z + ", " + x);
        }else if((y>x) && (y>z)){
            System.out.println("los numeros de mayor a menor son: " + y + ", " +
                    x + ", " + z);
        }else if((z>y) && (y>x)){
            System.out.println("los numeros de mayor a menor son: " + z + ", " +
                    y + ", " + x);
        }else if((z>x) && (x>y)){
            System.out.println("los numeros de mayor a menor son: " + z + ", " +
                    x + ", " + y);
        }
    }
}
