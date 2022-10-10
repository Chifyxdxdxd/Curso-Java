package poo.areapoligonos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * hacer un programa para calcular el área de Poligonos (triangulosy
 * rectangulos) el programa debe ser capaz de almacenar en un arreglo de N
 * triangulos y rectangulos, y al final mostrar el área y los datos de cada uno.
 * Para ello se tendrá lo siguiente: - una supepr clase llamada polígono. - una
 * sub clase llamada rectángulo. - una sub clase llamada triángulo.
 */
public class Principal {
    static Scanner ent = new Scanner(System.in);
    public static Rectangulo crearRectangulo() {       
        double lado1, lado2;

        System.out.println("Inserte el primer lado del rectángulo:");
        lado1 = ent.nextDouble();
        System.out.println("Inserte el segundo lado del rectángulo:");
        lado2 = ent.nextDouble();
        System.out.println("Rectangulo creado\n--------------------");
        
        return new Rectangulo(lado1, lado2);
    }

    public static Triangulo crearTriangulo() {
        double lado1, lado2, lado3;

        System.out.println("Inserte el primer lado del triangulo:");
        lado1 = ent.nextDouble();
        System.out.println("Inserte el segundo lado del triangulo:");
        lado2 = ent.nextDouble();
        System.out.println("Inserte el tercer lado del triangulo:");
        lado3 = ent.nextDouble();
        System.out.println("Triangulo creado\n--------------------");

        return new Triangulo(lado1, lado2, lado3);
    }

    public static void main(String[] args) {
        ArrayList<Poligono> pol = new ArrayList<>();
        int pos, num;
        
        //Menú
        do {
            System.out.println("""
                           \tMENÚ:
                           1. añadir rectangulo
                           2. añadir triangulo
                           3. mostrar poligonos
                           0. SALIR""");
            pos = ent.nextInt();
            if (pos == 0) {
                break;
            }
            
            switch (pos){
                case 1 ->{
                    System.out.println("Cuantos rectangulos va a crear?");
                    num = ent.nextInt();
                    
                    for (int i = 0; i < num; i++) {
                        pol.add(crearRectangulo());
                    }
                }
                case 2 ->{
                    System.out.println("Cuantos triangulos va a crear?");
                    num = ent.nextInt();
                    
                    for (int i = 0; i < num; i++) {
                        pol.add(crearTriangulo());
                    }
                    
                }
                case 3 ->{
                    System.out.println("Los poligonos creados tienen los datos:");
                    for (int i = 0; i < pol.size(); i++) {
                        System.out.println(pol.get(i).toString());
                    }
                }
                default -> System.out.println("número equivocado, por favor intente otra vez");
            }
            
        }while(pos!=0);
    }
}
