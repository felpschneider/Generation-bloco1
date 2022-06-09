/*	Exercício 3 - Exercícios com Vetores e Matrizes
 * 	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 *	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
 *	das matrizes N1 e N2;
 *	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
 *	posição das matrizes N1 e N2.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - Última alteração: 11h58min
 */
package org.generation.brazil.exercicios.array;

import java.util.Random;

public class Exercicio_3 {

	public static void main(String[] args) {

		Random matriz = new Random();
		
		int [][] N1 = new int[4][6];
		int [][] N2 = new int[4][6];
		int [][] M1 = new int[4][6];
		int [][] M2 = new int[4][6];

		System.out.println("Situação 3.a:");
		
		for (int i = 0; i < N2.length; i++) {
			for(int j = 0; j < N2.length; j++) {
				
				N1[i][j] = matriz.nextInt(0, 100);
				N2[i][j] = matriz.nextInt(0, 100);
				
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
				
				System.out.print(M1[i][j] + " | ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Situação 3.b:");
		
		for (int i = 0; i < M2.length; i++) {
			for(int j = 0; j < M2.length; j++) {
				
				System.out.print(M2[i][j] + " | ");
				
				
			}
			System.out.println("\n");
		}
		
		
		
		
	}

}
