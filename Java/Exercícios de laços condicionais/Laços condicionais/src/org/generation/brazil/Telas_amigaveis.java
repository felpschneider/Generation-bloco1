package org.generation.brazil;

import javax.swing.JOptionPane;

public class Telas_amigaveis {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		
		numero *= numero;
		
		JOptionPane.showMessageDialog(null, "Esse n�mero ao quadrado � " + numero);
		
	}

}
