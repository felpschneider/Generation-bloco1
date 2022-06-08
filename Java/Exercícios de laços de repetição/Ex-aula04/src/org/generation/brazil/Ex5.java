/*	Exercício 5 - DO... WHILE
 *  Crie um programa que leia um número do teclado até que encontre um
 *	número igual a zero. No final, mostre a soma dos números
 *	digitados.(DO...WHILE)
 *	Turma 54 da Generation de Java - 08/06/2022 - 13h25min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {

		int somaNumeros = 0;

		int numeroDigitado = 0;

		do {

			numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

			somaNumeros += numeroDigitado;

		} while (numeroDigitado != 0);

		JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " + somaNumeros);

	}

}
