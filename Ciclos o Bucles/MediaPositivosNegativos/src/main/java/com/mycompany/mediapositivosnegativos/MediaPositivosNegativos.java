package com.mycompany.mediapositivosnegativos;

import java.util.Scanner;

public class MediaPositivosNegativos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b=0, c=0, p=0, ce=0, n=0;

        for (int i = 0; i<10;i++){
            System.out.println("digite un número entero");
            a = entrada.nextInt();
            if (a==0){
                ce++;
            }else if (a<0){
                n++;
                c+=a;
            } else {
                p++;
                b+=a;
            }
        }
        
        
        if (n!=0)c = c/n;
        if (p!=0)b = b/p;
        System.out.println("La media de los números positivos es: " + b +
                    "\nLa media de los números negativos es: " + c + 
                    "\nLa cantidad de ceros es: " + ce);
    }
}
