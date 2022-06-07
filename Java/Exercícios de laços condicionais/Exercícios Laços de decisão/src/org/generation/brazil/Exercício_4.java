/*	Exerc�cio 4
 * 	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
 *	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
 *	�mpar exiba o n�mero elevado ao quadrado.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 07/06/2022 - �ltima altera��o: 15h14min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		
		double numeroQualquer = 
				Double.parseDouble(JOptionPane.showInputDialog(null, "Ol�, digite um n�mero: "));
		
		if(numeroQualquer % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado � par e sua ra�z quadrada � " 
			+ Math.sqrt(numeroQualquer));
		
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � �mpar e seu valor elevado ao quadrado � " 
		+ Math.pow(numeroQualquer, 2));
		}
	}

}
