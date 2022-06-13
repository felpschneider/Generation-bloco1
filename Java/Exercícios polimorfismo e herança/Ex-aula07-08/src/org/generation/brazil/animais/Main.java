package org.generation.brazil.animais;

public class Main {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		System.out.println(dog.nome = "Travis");
		System.out.println(horse.nome = "Carpeado");
		System.out.println(sloth.nome = "Geraldo");

		System.out.println(dog.idade = 8);
		System.out.println(horse.idade = 6);
		System.out.println(sloth.idade = 16);

		dog.Correr();
		horse.Correr();
		sloth.SubirArvore();
		
		dog.EmitirSom();
		horse.EmitirSom();
		sloth.EmitirSom();
		
		

	}

}
