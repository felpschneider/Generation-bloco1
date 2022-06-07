/*	Exercício 4
 * 	Faça um programa em que permita a entrada de um número qualquer e exiba se este
 *	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
 *	ímpar exiba o número elevado ao quadrado.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 07/06/2022 - Última alteração: 15h14min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Exercício_4 {

	public static void main(String[] args) {
		
		double numeroQualquer = 
				Double.parseDouble(JOptionPane.showInputDialog(null, "Olá, digite um número: "));
		
		if(numeroQualquer % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "O número digitado é par e sua raíz quadrada é " 
			+ Math.sqrt(numeroQualquer));
		
		}
		else {
			JOptionPane.showMessageDialog(null, "O número digitado é ímpar e seu valor elevado ao quadrado é " 
		+ Math.pow(numeroQualquer, 2));
		}
	}

}
