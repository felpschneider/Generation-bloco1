/*	Exercício 1 - FOR
 *  Informar todos os números de 1000 a 1999 que quando divididos por 11
 *	obtemos resto = 5. (FOR)
 *	Turma 54 da Generation de Java - 08/06/2022 - 11h42min
 */
package org.generation.brazil;

public class Ex1 {

	public static void main(String[] args) {

		int numeroDivisivel;

		for (int i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {

				numeroDivisivel = i;

				System.out.println("O número " + numeroDivisivel + " é divisível por 11");
			}
		}

	}

}
