package com.mycompany.matriztranspuestab;

import java.util.Scanner;

/**
 * Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla
 * en la segunda
 */
public class MatrizTranspuestaB {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matA[][] = new int[5][9];
        int matT[][] = new int[9][5];
        
        //llenar matriiz A
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                System.out.println("Valor del elemento " + (j + 1) + ", "
                        + (i + 1) + " de la matris A");
                matA[i][j] = entrada.nextInt();
            }
        }
        
        //trasponer matrices
        for (int i = 0; i < matT.length; i++) {
            for (int j = 0; j < matT[i].length; j++) {
                matT[i][j] = matA[j][i];
            }
        }
        
        //Imprimir matriz
        System.out.println("\n la matriz generada es:\n");
        for (int i = 0; i < matA.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matA[i].length; j++) {
                System.out.print(matA[i][j]);
                if (j != matA[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
        
        //Imprimir matriz Transpuesta
        System.out.println("\n la matriz transpuesta es:\n");
        for (int i = 0; i < matT.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matT[i].length; j++) {
                System.out.print(matT[i][j]);
                if (j != matT[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
