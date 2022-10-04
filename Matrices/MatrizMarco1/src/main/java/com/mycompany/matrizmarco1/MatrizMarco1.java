package com.mycompany.matrizmarco1;

import java.util.Scanner;

/**
 * crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0 salvo
 * los de los bordes que deben ser 1. Mostrarla
 */
public class MatrizMarco1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mat[][], fil, col;

        //pedir filas y columnas
        System.out.println("cual es el número de filas?");
        fil = entrada.nextInt();
        System.out.println("cual es el número de columnas?");
        col = entrada.nextInt();

        //llenar matriiz 
        mat = new int[fil][col];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == mat.length - 1 || j == mat[i].length - 1 || i == 0 || j == 0) {
                    mat[i][j] = 1;
                }
            }
        }

        System.out.println("\n la matriz generada es:\n");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("|");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
                if (j != mat[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
}
