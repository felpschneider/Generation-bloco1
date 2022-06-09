/*	Exerc�cio 2 - Exerc�cios com Vetores e Matrizes
 * 	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
 *	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
 *	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
 * 	quantas foram as ocorr�ncias da maior pontua��o.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - �ltima altera��o: 11h26min
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
			
			JOptionPane.showMessageDialog(null, "O dado " + (i+1) + " caiu no n�mero " + dados[i]);
			
			if(dados[i] == maiorValor) {
			
				ocorrencias++;
				
			}
			
		}
		
		media = media / dados.length;
		
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica foi de " + media);
		JOptionPane.showMessageDialog(null, "O maior n�mero foi " + maiorValor + " e ele caiu " + ocorrencias + " vezes");
	}

	}

