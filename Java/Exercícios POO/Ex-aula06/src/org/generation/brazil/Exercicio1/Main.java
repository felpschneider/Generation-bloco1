/*	Exercício 1- POO
 * 	/*	Exercício 1- Exercícios com Vetores e Matrizes
 * 	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 *	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 09/06/2022 - Última alteração: 18h14min
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 10/06/2022 - Última alteração: 
 */
package org.generation.brazil.Exercicio1;

public class Main {

	public static Cliente cliente;

	public static void main(String[] args) {

		cliente = new Cliente();
		
		System.out.println("Olá! Você está na loja Geração! Vamos confirmar seus dados:");
		
		Cliente.ConfirmarInformacoes();
		Cliente.EscolherItem();
		Cliente.Comprar(1000);
	
	}

}
