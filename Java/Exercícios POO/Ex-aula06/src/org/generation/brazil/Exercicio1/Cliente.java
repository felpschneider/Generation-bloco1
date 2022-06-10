package org.generation.brazil.Exercicio1;

import java.util.Scanner;

public class Cliente {
	
	static Scanner leia = new Scanner(System.in);
	
	private static String nome = "Felipe";
	private static String cpf = "987456321";
	private static int idade = 18;
	private static double dinheiro = 1000;
	private static boolean querComprar;
	private static String resposta;

	private static double custo = 500;
	
	public static void ConfirmarInformacoes() {
		System.out.println("Seu nome � " + nome + "\nSeu CPF � " + cpf + "\nE tem 18 anos");
	}
	
	public static void EscolherItem() {
		
		System.out.println(nome + " voc� gostaria de comprar o item? Ele custa R$" + custo);
		
		resposta = leia.next().toLowerCase();
		
		if(resposta == "SIM".toLowerCase()) {
			
			querComprar = true;
			
		}
		else {
			
			querComprar = false;
			
			System.out.println("Voc� n�o comprou o item.");
		}
		
	}
	public static void Comprar(double dinheiro) {
		
		double podeComprar = dinheiro - custo;
		
		if(podeComprar >= 0 && querComprar) {
			
			System.out.println("Parab�ns! Voc� adquiriu o item!");
		
	}
	
}
}
