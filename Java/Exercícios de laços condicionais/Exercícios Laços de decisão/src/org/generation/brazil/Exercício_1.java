/*	Exerc�cio 1 - La�os condicionais
 * 	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 07/06/2022 - �ltima altera��o: 12h51min
 */
package org.generation.brazil;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio_1 {

	private static Scanner entrada;
	private static Locale english;

	public static void main(String[] args) {
		english = Locale.ENGLISH;
		Locale.setDefault(english);
		
		entrada = new Scanner(System.in);
		
		double[] digitoUsuario = new double[3] ;
		
		System.out.println("Vamos descobrir qual valor � maior?");
		System.out.print("Digite um n�mero: ");
		digitoUsuario[0] = entrada.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		digitoUsuario[1] = entrada.nextDouble();
		
		System.out.print("Digite o �ltimo n�mero: ");
		digitoUsuario[2] = entrada.nextDouble();
		
		double maiorNumero = 0;
		
		for(int i = 0; i < digitoUsuario.length; i++) {
			if(digitoUsuario[i] > maiorNumero) {
				maiorNumero = digitoUsuario[i];
			}
		}
		
		System.out.println("O maior n�mero � " + maiorNumero);
	}

}
