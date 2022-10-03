package com.mycompany.sumaimpares;

public class SumaImpares {

    public static void main(String[] args) {
        int a=1, b=1;
        for (int i = 0; i<10;i++){
            b*=a;
            a+=2;
        }
        System.out.println("el producto de los número es: " + b);
    }
}
