package poo.cuadrilatero;

import java.util.Scanner;

/**
 * Construir un programa que calcule el área y el perímetro de un cuadrilátero
 * dada la longitud de sus dos lados. Los valores de la longitud deberán
 * introducirse por linea de ordenes. Si es un cuadrado, sólo se proporcionará
 * la longitud de uno de los lados al constructor.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuadrilatero cua;
        float lado1, lado2;

        //pedir lados
        System.out.println("Cual es el valor del largo en metros?");
        lado1 = entrada.nextFloat();
        System.out.println("Cual es el valor del ancho en metros?");
        lado2 = entrada.nextFloat();

        //llamando al constructor
        if (lado1 == lado2) {
            cua = new Cuadrilatero(lado1);
        } else {
            cua = new Cuadrilatero(lado1, lado2);
        }

        //imprimimos los valores
        System.out.println("El perimetro del cuadrilatero es: " + cua.getPerimetro(lado1, lado2)
                + " metros.\nEl area del cuadrilatero es: " + cua.getArea(lado1, lado2) + "metros cuadraros.");
    }

}
