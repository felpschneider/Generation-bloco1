/*	Exerc�cio 1- POO
 * 	/*	Exerc�cio 1- Exerc�cios com Vetores e Matrizes
 * 	Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
 *	atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - �ltima altera��o: 18h14min
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 10/06/2022 - �ltima altera��o: 
 */
package org.generation.brazil.Exercicio1;

public class Main {

	public static Cliente cliente;

	public static void main(String[] args) {

		cliente = new Cliente();
		
		System.out.println("Ol�! Voc� est� na loja Gera��o! Vamos confirmar seus dados:");
		
		Cliente.ConfirmarInformacoes();
		Cliente.EscolherItem();
		Cliente.Comprar(1000);
	
	}

}
