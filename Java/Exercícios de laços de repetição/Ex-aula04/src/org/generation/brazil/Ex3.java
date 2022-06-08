/*	Exercício 3 - WHILE
 *  Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
 *	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
 *	idade for =-99.
 *	Turma 54 da Generation de Java - 08/06/2022 - 11h52min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {

		int[] idadesUsuarios = new int[150];

		int menor21 = 0;

		int maior50 = 0;

		for (int i = 0; idadesUsuarios[i] != -99;) {

			while (idadesUsuarios[i] != -99) {

				idadesUsuarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá! Digite sua idade: "));

				if (idadesUsuarios[i] < 21) {

					menor21++;

				} else if (idadesUsuarios[i] > 50) {

					maior50++;

				} else {

				}
			}

			JOptionPane.showMessageDialog(null, "Total de pessoas com menos " + "de 21 anos é " + menor21
					+ " e o total de pessoas com mais" + " de 50 anos é de " + maior50);

			break;

		}

	}
}
