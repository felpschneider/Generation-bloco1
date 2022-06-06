/*	Exerc�cio 2 - programa��o sequencial em Java
 * 	Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
 *	expressa em anos, meses e dias.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 06/06/2022 - �ltima altera��o: 18h14min
 */
package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio2 {
	private static Scanner idade;
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		idade = new Scanner (System.in);
		
		System.out.print("Vamos transformar sua idade em dias em anos, meses e dias?");
		System.out.print("\nDigite sua idade em dias: ");

		int idadeDias = idade.nextInt();
		
		int idadeAnos = idadeDias / 365;

		int idadeMeses = (idadeDias % 365) / 30;

		idadeDias = idadeMeses % 30;

		System.out.println("Sua idade em anos, meses e dias �: " + idadeAnos + ", "
		+ idadeMeses + " e " + idadeDias);
	}

}

