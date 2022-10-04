package com.mycompany.matrizsimetrica;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
 */
public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mat[][], fil, col;
        boolean sim = true;

        //pedir filas y columnas
        System.out.println("cual es el número de filas?");
        fil = entrada.nextInt();
        System.out.println("cual es el número de columnas?");
        col = entrada.nextInt();

        //llenar matriiz
        mat = new int[fil][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                System.out.println("Valor del elemento " + (j + 1) + ", " + (i + 1));
                mat[i][j] = entrada.nextInt();
            }
        }

        //comprobar si es simetrica
        aa:
        if (fil == col && sim == true) {
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < fil; j++) {
                    if (mat[i][j] != mat[j][i]) {
                        sim = false;
                        break aa;
                    }
                }
            }

        } else {
            sim = false;
        }

        //resultadp
        if (sim) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("la matriz no es simétrica");
        }

    }
}
