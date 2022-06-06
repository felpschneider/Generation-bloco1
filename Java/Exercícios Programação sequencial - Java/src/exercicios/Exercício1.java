/*	Exerc�cio 1 - programa��o sequencial em Java
 * 	Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
 * 	dias e mostre-a expressa apenas em dias.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 06/06/2022 - �ltima altera��o: 18h07min
 */
package exercicios;

import java.util.Scanner;

public class Exerc�cio1 {
	private static Scanner idade;
	
	public static void main(String[] args) {
		
		idade = new Scanner (System.in);
		
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		
		System.out.print("Ol�! Digite sua idade em anos: ");
		idadeAnos = idade.nextInt();
		
		System.out.print("Legal! Agora digite quantos meses voc� tem: ");
		idadeMeses = idade.nextInt();
		
		System.out.print("Para finalizar, diga quantos dias: ");
		idadeDias = idade.nextInt();

		int resultadoAnos = idadeAnos * 365;
		int resultadoMeses = idadeMeses * 30;
		int resultadoFinal = resultadoAnos + resultadoMeses + idadeDias;

		System.out.println("Sua idade em dias �: " + resultadoFinal);
	}

}
