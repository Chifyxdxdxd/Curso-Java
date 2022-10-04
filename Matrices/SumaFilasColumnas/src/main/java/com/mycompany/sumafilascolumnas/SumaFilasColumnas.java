package com.mycompany.sumafilascolumnas;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de
 * cada columna
 */
public class SumaFilasColumnas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mat[][], fil, col, sum = 0;

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

        //Imprimir matriz
        System.out.println("\n la matriz generada es:\n");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("|");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
                if (j != mat[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }

        //suma de filas
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sum);
            sum = 0;
        }

        //suma de Columnas
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < mat[j].length; i++) {
                sum += mat[i][j];
            }
            System.out.println("La suma de la columna " + (j + 1) + " es: " + sum);
            sum = 0;
        }

    }
}
