/*	Exerc�cio 2
 * 	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 07/06/2022 - �ltima altera��o: 14h46min
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		
		int[] digitoUsuario = new int[3] ;
		
		digitoUsuario [0]= Integer.parseInt(JOptionPane.showInputDialog("Vamos colocar os n�meros em ordem!"
				+ "\nDigite o primeiro n�mero inteiro: "));
		
		digitoUsuario [1]= Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));
		
		digitoUsuario [2]= Integer.parseInt(JOptionPane.showInputDialog("Digite o �ltimo n�mero: "));
	
		int auxiliar = 0;
		
		for (int i = 0; i < digitoUsuario.length; i++) {
	        for (int j = 0; j < digitoUsuario.length - 1; j++) {
	            if (digitoUsuario[j] > digitoUsuario[j + 1]) {
	                auxiliar = digitoUsuario[j];
	                digitoUsuario[j] = digitoUsuario[j + 1];
	                digitoUsuario[j + 1] = auxiliar;
	            }
	        }
	    }
			
		JOptionPane.showMessageDialog(null, "Os n�meros do menor para o maior s�o: " + digitoUsuario[0] + " " 
		+ digitoUsuario[1] + " e " + digitoUsuario[2]);

	}
}
