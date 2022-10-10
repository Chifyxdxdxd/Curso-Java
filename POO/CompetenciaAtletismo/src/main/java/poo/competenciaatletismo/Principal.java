package poo.competenciaatletismo;

import java.util.Scanner;

/**
 * Constriur un programa para una competencia de atletismo, el programa debe
 * gestionar una serie de atletas caracterizados por su número de atleta, nombre
 * y tiempo de carrera, al final el programa debe mostrar los datos del atleta
 * ganador de la carrera.
 */
public class Principal {
    public static Atleta crearAtleta() {
        Scanner entrada = new Scanner(System.in);
        String nombre; 
        int numero;
        float tiempo;

        System.out.println("Cuál es nombre del atleta?");
        nombre = entrada.next();
        System.out.println("Qué número de identificación tiene?");
        numero = entrada.nextInt();
        System.out.println("Cuál es el tiempo del atleta?");
        tiempo = entrada.nextFloat();

        return new Atleta(nombre, numero, tiempo);
    }
    public static void main(String[] args) {
        Atleta xd[] = new Atleta [5];
        int pos = 0;

        //creando atletas
        for (int i = 0; i < xd.length; i++) {
            xd[i] = crearAtleta();
        }

        //comparar
        for (int i = 1; i < xd.length; i++) {
            if (xd[pos].getTiempo() > xd[i].getTiempo()) {
                pos = i;
            }
        }

        //imprimir el resultado        
        System.out.println(xd[pos].getAtleta());
    }
}
