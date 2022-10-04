package com.mycompany.arreglosnotas;

import java.util.Scanner;

/**
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un
 * centro educativo. Cada grupo (o clase) esta compuesto por 5 alumnos. Se pude
 * leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos
 * mostrar al final: la nota media del grupo en cada trimestre, y la media del
 * alumno que se encuentra en la posición N. N se lee por teclado
 */
public class ArreglosNotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float pri[] = new float[5];
        float seg[] = new float[5];
        float ter[] = new float[5];
        int pos;
        float media = 0;

        //rellenar trimestre
        for (int i = 0; i < pri.length; i++) {
            System.out.println("Escribe la nota del alumno " + (i + 1)
                    + " del primer trimestre");
            pri[i] = entrada.nextFloat();
        }

        //rellenar trimestre
        for (int i = 0; i < seg.length; i++) {
            System.out.println("Escribe la nota del alumno " + (i + 1)
                    + " del segundo trimestre");
            seg[i] = entrada.nextFloat();
        }

        //rellenar trimestre
        for (int i = 0; i < ter.length; i++) {
            System.out.println("Escribe la nota del alumno " + (i + 1)
                    + " del tercer trimestre");
            ter[i] = entrada.nextFloat();
        }

        //preguntar alumno
        System.out.println("de que alumno desea ver la media?");
        pos = entrada.nextInt() - 1;

        //media de los trimestres
        for (int i = 0; i < pri.length; i++) {
            media += pri[i];
        }
        media /= pri.length;
        System.out.println("\nla media de todo el grupo en "
                + "el primer trimestre es: " + media + "\n");
        media = 0;

        for (int i = 0; i < seg.length; i++) {
            media += seg[i];
        }
        media /= seg.length;
        System.out.println("\nla media de todo el grupo en"
                + " el segundo trimestre es: " + media + "\n");
        media = 0;

        for (int i = 0; i < ter.length; i++) {
            media += ter[i];
        }
        media /= ter.length;
        System.out.println("la media de todo el grupo en"
                + " el segundo trimestre es: " + media + "\n");
        media = 0;

        //Media del alumno
        media = (ter[pos] + pri[pos] + seg[pos]) / 3;
        System.out.println("la media del alumno durante los "
                + "tres trimestres es: " + media);
    }
}
