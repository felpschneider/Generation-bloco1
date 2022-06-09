/*	Exercício 4 - Exercícios com Vetores e Matrizes
 * 	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
 *	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 *	diagonal, ou seja, diagonal principal.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - Última alteração: 12h11min
 */
package org.generation.brazil.exercicios.array;

import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {

		int[][] matriz = new int [3][3];
		
		int somaDiagonal = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da matriz na posição " 
				+ (i+1) + ", " + (j+1)));
				
				JOptionPane.showMessageDialog(null, "O valor digitado foi " + matriz [i][j]); 
				
				if(i==j) {
					
					somaDiagonal += matriz[i][j];
					
				}
			}
		}
	
		JOptionPane.showMessageDialog(null, "O valor da soma das diagonais é: " + somaDiagonal); 

		
	}

}
