/*	Exercício 2 - Exercícios com Vetores e Matrizes
 * 	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 *	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 *	imprima a média aritmética dos lançamentos, contabilize e apresente também
 * 	quantas foram as ocorrências da maior pontuação.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - Última alteração: 11h26min
 */
package org.generation.brazil.exercicios.array;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio_2 {

	public static void main(String[] args) {

		Random gerador = new Random();
		
		int[] dados = new int [10];
		
		int media = 0;
		
		int ocorrencias = 0;
		
		int maiorValor = 0;
		
		for (int i = 0; i < dados.length; i++) {
			
			dados[i] = gerador.nextInt(1, 6);
			
			media += dados[i];
			
			if(maiorValor < dados[i]) {
				
				maiorValor = dados[i];
				
			}
			
		}
		
		for (int i = 0; i < dados.length; i++) {
			
			JOptionPane.showMessageDialog(null, "O dado " + (i+1) + " caiu no número " + dados[i]);
			
			if(dados[i] == maiorValor) {
			
				ocorrencias++;
				
			}
			
		}
		
		media = media / dados.length;
		
		JOptionPane.showMessageDialog(null, "A média aritmética foi de " + media);
		JOptionPane.showMessageDialog(null, "O maior número foi " + maiorValor + " e ele caiu " + ocorrencias + " vezes");
	}

	}

