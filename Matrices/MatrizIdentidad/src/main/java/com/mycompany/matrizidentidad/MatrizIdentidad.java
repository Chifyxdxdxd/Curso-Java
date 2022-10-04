package com.mycompany.matrizidentidad;

import java.util.Scanner;

/**
 * Crear una matriz de tamaño 7x7 y rellenarla de forma que los lementos de la
 * diagonal principal sean 1 y el resto 0.
 */
public class MatrizIdentidad {

    public static void main(String[] args) {
        int matI[][] = new int[7][7];

        //llenar matriiz I
        for (int i = 0; i < matI.length; i++) {
            for (int j = 0; j < matI[i].length; j++) {
                if (i == j) {
                    matI[i][j] = 1;
                }
            }
        }

        //Imprimir matriz
        System.out.println("\n la matriz generada es:\n");
        for (int i = 0; i < matI.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matI[i].length; j++) {
                System.out.print(matI[i][j]);
                if (j != matI[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
