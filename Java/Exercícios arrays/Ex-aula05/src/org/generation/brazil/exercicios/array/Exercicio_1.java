/*	Exercício 1- Exercícios com Vetores e Matrizes
 * 	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 *	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - Última alteração: 11h12min
 */
package org.generation.brazil.exercicios.array;

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {

		int[] pontuacao = new int[5];
		
		int maiorPontuacao = 0;
		
		JOptionPane.showMessageDialog(null, "Olá! Escreva 5 valores inteiros que eu te mostro o maior entre eles!");
		
		for (int i = 0; i < pontuacao.length; i++) {
			
			pontuacao[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da " + (i+1) + "ª atividade"));
			
			JOptionPane.showMessageDialog(null, "O valor digitado foi: " + pontuacao[i]);
			
			if(maiorPontuacao < pontuacao[i]) {
				
				maiorPontuacao = pontuacao[i];
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "O maior número entre eles foi " + maiorPontuacao);
		
	}

}
