/*	Exerc�cio 2 - FOR
 *  Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 *	Turma 54 da Generation de Java - 08/06/2022 - 11h52min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {

		int[] numerosUsuario = new int[10];

		int pares = 0;

		int impares = 0;

		JOptionPane.showMessageDialog(null, "Coloque 10 n�meros para " + "descobrirmos se s�o pares ou �mpares");

		for (int i = 0; i < numerosUsuario.length; i++) {

			numerosUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� n�mero"));

			if (numerosUsuario[i] % 2 == 0) {

				pares += 1;

			} else {

				impares += 1;

			}

		}

		JOptionPane.showMessageDialog(null,
				"Voc� digitou " + pares + " n�meros pares e " + impares + " n�meros �mpares.");

	}

}
