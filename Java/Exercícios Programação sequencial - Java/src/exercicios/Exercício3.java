/*	Exerc�cio 3 - programa��o sequencial em Java
 * 	Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
 *	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 06/06/2022 - �ltima altera��o: 18h45min
 */
package exercicios;

import java.util.Scanner;

public class Exerc�cio3 {

	private static Scanner duracao;

	public static void main(String[] args) {
		
		duracao = new Scanner (System.in);
		
		System.out.println("Vamos descobrir quanto tempo em segundos durou o evento?");
		System.out.print("Digite a dura��o do evento em segundos: ");
		
		int segundos = duracao.nextInt();

		int minutos = segundos / 60;

		int horas = (int) minutos / 60;

		minutos = minutos % 60;

		segundos = segundos % 60;

		System.out.print("O evento na da f�brica durou ");
		
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
