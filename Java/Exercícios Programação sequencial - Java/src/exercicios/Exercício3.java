/*	Exercício 3 - programação sequencial em Java
 * 	Faça um sistema que leia o tempo de duração de um evento em uma fábrica
 *	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 06/06/2022 - Última alteração: 18h45min
 */
package exercicios;

import java.util.Scanner;

public class Exercício3 {

	private static Scanner duracao;

	public static void main(String[] args) {
		
		duracao = new Scanner (System.in);
		
		System.out.println("Vamos descobrir quanto tempo em segundos durou o evento?");
		System.out.print("Digite a duração do evento em segundos: ");
		
		int segundos = duracao.nextInt();

		int minutos = segundos / 60;

		int horas = (int) minutos / 60;

		minutos = minutos % 60;

		segundos = segundos % 60;

		System.out.print("O evento na da fábrica durou ");
		
		if (horas == 1)
		{
			System.out.print(horas + " hora ");
		}
		else if (horas > 1) {
			System.out.print(horas + " horas, ");
		}
		
		if (minutos == 1)
		{
			System.out.print(minutos + " minuto, ");
		}
		else if (minutos > 1) {
			System.out.print(minutos + " minutos, ");
		}
		
		if (segundos == 1)
		{
			System.out.print(segundos + " segundo. ");
		}
		else if (segundos > 1) {
			System.out.print(segundos + " segundos. ");
		}

	}

}
