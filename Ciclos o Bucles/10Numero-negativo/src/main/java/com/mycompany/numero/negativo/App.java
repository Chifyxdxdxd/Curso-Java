package com.mycompany.numero.negativo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n;
        boolean neg=false;
        
        for (int i=0; i<10;i++){
            System.out.println("Digite un número");
            n = entrada.nextFloat();
            
            if (n<0)neg=true;
        }
        
        if(neg){
            System.out.println("Has introducido almenos un número negativo");
        }else{
            System.out.println("Solo has introducido numeros positivos");
        }
    }
}
