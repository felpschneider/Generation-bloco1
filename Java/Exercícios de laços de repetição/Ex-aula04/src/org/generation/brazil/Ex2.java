/*	Exercício 2 - FOR
 *  Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 *	Turma 54 da Generation de Java - 08/06/2022 - 11h52min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {

		int[] numerosUsuario = new int[10];

		int pares = 0;

		int impares = 0;

		JOptionPane.showMessageDialog(null, "Coloque 10 números para " + "descobrirmos se são pares ou ímpares");

		for (int i = 0; i < numerosUsuario.length; i++) {

			numerosUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número"));

			if (numerosUsuario[i] % 2 == 0) {

				pares += 1;

			} else {

				impares += 1;

			}

		}

		JOptionPane.showMessageDialog(null,
				"Você digitou " + pares + " números pares e " + impares + " números ímpares.");

	}

}
