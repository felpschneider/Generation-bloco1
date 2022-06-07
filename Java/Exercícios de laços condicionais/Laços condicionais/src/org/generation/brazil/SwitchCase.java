package org.generation.brazil;

import java.util.Scanner;

public class SwitchCase {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
		System.out.print("Escreva uma letra: ");
		
		char letra = entrada.next().charAt(0);
		
		switch(letra) {
		case 'a', 'A':
			System.out.println("Annie");
			break;	
		case 'f', 'F':
			System.out.println("Felipe");	
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}

}
