package poo.numeroscomplejos;

import java.util.Scanner;

/**
 * Construir un programa para trabajar con 2 números complejos, implemente el
 * siguiente menú: 1. sumar dos números complejos 2. multiplicar 2 números
 * complejos 3. comparar 2 números complejos (iguals o no) 4. multiplicar un
 * número complejo por un entero
 */
public class Principal {

    public static NumeroComplejo crearNC() {
        Scanner entrada = new Scanner(System.in);
        double real, imaginario;

        System.out.println("Cuál es el componente real del numero complejo?");
        real = entrada.nextDouble();
        System.out.println("cuál es el componente imaginario del numero complejo?");
        imaginario = entrada.nextDouble();

        return new NumeroComplejo(real, imaginario);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroComplejo c1, c2, c3;
        int entero, op = 5;
        boolean igualdad;

        //crear números complejos
        c1 = crearNC();
        c2 = crearNC();
        System.out.println("digite un número entero");
        entero = entrada.nextInt();

        //Menú
        do {
            //seleccionamos la opción
            System.out.println("""
                           \tMENÚ:
                           1. sumar dos números complejos
                           2. multiplicar 2 números complejos
                           3. comparar 2 números complejos (iguals o no)
                           4. multiplicar un número complejo por un entero
                           0. SALIR""");
            op = entrada.nextInt();
            if (op == 0) {
                break;
            }
            switch (op) {
                case 1 -> {
                    c3 = c1.calcularSuma(c2);
                    System.out.println("el numero complejo resultante es: "
                            + c3.getComplejo());
                }
                case 2 -> {
                    c3 = c1.calcularProducto(c2);
                    System.out.println("el numero complejo resultante es: "
                            + c3.getComplejo());
                }
                case 3 -> {
                    igualdad = c1.comprobarIgualdad(c1, c2);
                    if (igualdad) {
                        System.out.println("los números son iguales");
                    } else {
                        System.out.println("Los números no son iguales");
                    }
                }
                case 4 -> {
                    c3 = c1.productoPorEntero(c1, entero);
                    System.out.println("el numero complejo resultante es: "
                            + c3.getComplejo());
                }
                default ->
                    System.out.println("Número equivocado");
            }
        } while (op != 0);

    }
}
