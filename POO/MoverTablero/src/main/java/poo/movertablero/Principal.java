package poo.movertablero;

import java.util.Scanner;

/**
 * Construir un programa que permita dirigir el movimiento de un objeto dentro
 * de un tablero y actualice su posición dentro del mismo. Los movimientos
 * posibles son ARRIBA, ABAJO IZQUIERDA y DERECHA. Tras cada movimiento el
 * programa mostrará la nueva dirección elegida y las coordenadas de situación
 * del objeto dentro del tablero.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Tablero tab;
        int x, y, pos=5, inc;
        
        //Coordenadas iniciales
        System.out.println("Cuál es la posición inicial de X?");
        x = entrada.nextInt();
        System.out.println("Cuál es la posición inicial de Y?");
        y = entrada.nextInt();
        
        //creamos el tablero
        tab = new Tablero(x,y); 
        
        //Menú
        do{
            //seleccionamos la opción
            System.out.println("""
                           \tMENÚ:
                           1. Mover hacia ARRIBA.
                           2. Mover hacia ABAJO
                           3. Mover hacia DERECHA
                           4. Mover hacia IZQUIERDA
                           0. SALIR""");
            pos = entrada.nextInt();
            if (pos==0)break;
            System.out.println("Cuanto se va a mover en el tablero?");
            inc = entrada.nextInt();
            switch(pos){
                case 1 ->tab.moverArriba(inc);
                case 2 ->tab.moverAbajo(inc);
                case 3 ->tab.moverDerecha(inc);
                case 4 ->tab.moverIzquierda(inc);
                default -> System.out.println("Número equivocado");
            }
            //declaramos la nueva posición
            System.out.println("Las nuevas coordenadas son:\nX = "
                    + tab.getX()+", Y = " + tab.getY());
        }while (pos!=0);
        
        
        
    }
}
