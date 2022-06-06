/*	Exercício 1 - programação sequencial em Java
 * 	Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
 * 	dias e mostre-a expressa apenas em dias.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 06/06/2022 - Última alteração: 18h07min
 */
package exercicios;

import java.util.Scanner;

public class Exercício1 {
	private static Scanner idade;
	
	public static void main(String[] args) {
		
		idade = new Scanner (System.in);
		
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		
		System.out.print("Olá! Digite sua idade em anos: ");
		idadeAnos = idade.nextInt();
		
		System.out.print("Legal! Agora digite quantos meses você tem: ");
		idadeMeses = idade.nextInt();
		
		System.out.print("Para finalizar, diga quantos dias: ");
		idadeDias = idade.nextInt();

		int resultadoAnos = idadeAnos * 365;
		int resultadoMeses = idadeMeses * 30;
		int resultadoFinal = resultadoAnos + resultadoMeses + idadeDias;

		System.out.println("Sua idade em dias é: " + resultadoFinal);
	}

}
