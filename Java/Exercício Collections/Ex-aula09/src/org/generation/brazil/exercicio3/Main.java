package org.generation.brazil.exercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Produtos produto1 = new Produtos("Shampoo");
		Produtos produto2 = new Produtos("Condicionador");
		Produtos produto3 = new Produtos("Creme de rosto");
		Produtos produto4 = new Produtos("Chocolate");
		Produtos produto5 = new Produtos("Goiabada");
		
		ArrayList<Produtos> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
		System.out.println("Produtos em estoque: \n" + produtos);
		
		produtos.remove(produto4);
		produtos.remove(produto2);
		
		System.out.println("\nProdutos removidos, continuam em estoque: " + produtos);
		
		Produtos produto6 = new Produtos("Waffer");
		Produtos produto7 = new Produtos("Gengibre");
		
		produtos.set(0, produto6);
		produtos.set(2, produto7);
		
		System.out.println("\nProdutos substituidos, o estoque está assim: " + produtos);
		
		produtos.add(produto4);
		produtos.add(produto2);
		produtos.add(produto1);
		produtos.add(produto5);

		System.out.println("\nTodos os produtos da list são:" + produtos);
		
	}

}
