package poo.vehiculobarato;

import java.util.Scanner;

/**
 * Contruir un programa que dada una serie de vehiculos caracterizados por su
 * marca, modelo y precio, imprima las propidades del vehículo más barato. Para
 * ello, se debería leer por teclado las características de cada vehículo y
 * crear una clase que represente a cada uno de ellos.
 */
public class Principal {

    public static Carro crearCarro() {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;

        System.out.println("Cuál es la marca del vehículo?");
        marca = entrada.next();
        System.out.println("Cuál es el modelo del vehículo?");
        modelo = entrada.next();
        System.out.println("Cuál es el precio del vehículo?");
        precio = entrada.nextFloat();

        return new Carro(marca, modelo, precio);
    }

    public static void main(String[] args) {
        Carro xd[] = new Carro[5];
        int pos = 0;

        //creando carros 
        for (int i = 0; i < xd.length; i++) {
            xd[i] = crearCarro();
        }

        //comparar
        for (int i = 1; i < xd.length; i++) {
            if (xd[pos].getPrecio() > xd[i].getPrecio()) {
                pos = i;
            }
        }

        //imprimir el resultado        
        System.out.println(xd[pos].getCarro());
    }
}
