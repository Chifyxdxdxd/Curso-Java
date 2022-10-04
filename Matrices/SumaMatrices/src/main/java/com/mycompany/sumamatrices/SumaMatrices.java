package com.mycompany.sumamatrices;

import java.util.Scanner;

/**
 * crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
public class SumaMatrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matA[][] = new int[3][3];
        int matB[][] = new int[3][3];
        int matC[][] = new int[3][3];

        //llenar matriiz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Valor del elemento " + (j + 1) + ", "
                        + (i + 1) + " de la matris A");
                matA[i][j] = entrada.nextInt();
            }
        }

        //llenar matriiz B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Valor del elemento " + (j + 1) + ", "
                        + (i + 1) + " de la matriz B");
                matB[i][j] = entrada.nextInt();
            }
        }

        //sumar matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matC[i][j] = matB[i][j] + matA[i][j];
            }
        }

        //imprimir resultado 
        System.out.println("\n la suma de las matrices es:\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matC[i][j]);
                if (j != matC[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
}
