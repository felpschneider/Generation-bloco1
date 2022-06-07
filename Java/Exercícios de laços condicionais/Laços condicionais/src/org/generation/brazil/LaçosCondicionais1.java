package org.generation.brazil;

import java.util.Scanner;

public class LaçosCondicionais1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		double nota1;
		double nota2;
		
		System.out.print("Digite a nota da primeira prova: ");
		nota1 = entrada.nextDouble();
		
		System.out.print("Digite a nota da segunda prova: ");
		nota2 = entrada.nextDouble();
		
		double mediaSimples = (nota1 + nota2) / 2;
		
		if(mediaSimples >= 6.0 && mediaSimples <= 9.0) {
			System.out.println("Você foi aprovado com uma média de " + mediaSimples);
		} else if(mediaSimples == 10.0) {
			System.out.println("Você foi aprovado com louvor!");
		} else {
			System.out.println("Você foi reprovado pois sua nota foi " + mediaSimples);
			
		}
	}

}
