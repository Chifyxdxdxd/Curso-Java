package poo.trianguloisoseles;

import java.util.Scanner;

/**
 * Diseñar un programa para trabajar con triángulos isósceles. Para ello defina
 * los atributos necesarios que se requiern, proporcione métodos de consulta, un
 * método constructor e implimente los métodos para calcular el prímetro y el
 * área de un triangulo, además de impementar un método que a partir de un
 * arreglo de triangulos devuelva el área del triandulo de mayor superficie.
 */
public class Principal {
    public static Triangulo crearT(){
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        
        System.out.println("Cuál es la base del triangulo? en cm");
        base= entrada.nextDouble();
        System.out.println("Cuál es el lado del triangulo? en cm");
        lado = entrada.nextDouble();
        
        return new Triangulo (base, lado);
    }
    public static void main(String[] args) {
        Triangulo xd[]= new Triangulo [5];
        int pos=0;
        
        //creando triangulos
        for (int i = 0; i < xd.length; i++) {
            xd[i] = crearT();
        }

        //comparar
        for (int i = 1; i < xd.length; i++) {
            if (xd[pos].getArea() < xd[i].getArea()) {
                pos = i;
            }
        }

        //imprimir el resultado        
        System.out.println(xd[pos].getDatos());
    }
}
