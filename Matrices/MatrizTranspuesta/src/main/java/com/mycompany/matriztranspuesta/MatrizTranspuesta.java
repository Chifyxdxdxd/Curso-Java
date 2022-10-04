package com.mycompany.matriztranspuesta;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
 */
public class MatrizTranspuesta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matA[][] = new int[3][3];
        int matT[][] = new int[3][3];
        
        //llenar matriiz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Valor del elemento " + (j + 1) + ", "
                        + (i + 1) + " de la matris A");
                matA[i][j] = entrada.nextInt();
            }
        }
        
        //trasponer matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matT[i][j] = matA[j][i];
            }
        }
        
        //Imprimir matriz
        System.out.println("\n la matriz transpuesta es:\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matT[i][j]);
                if (j != matT[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
