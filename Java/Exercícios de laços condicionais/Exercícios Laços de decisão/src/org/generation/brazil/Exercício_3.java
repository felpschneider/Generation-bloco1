/*	Exercício 3
 * 	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
 *	categoria ela se encontra:
*  10-14 infantil
*  15-17 juvenil
*  18-25 adulto
 * 	Autor: Felipe Schneider - Turma 54 da Generation
 * 	Data: 07/06/2022 - Última alteração: 15h
 */
package org.generation.brazil;

import javax.swing.JOptionPane;

public class Exercício_3 {

	public static void main(String[] args) {
		
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Vamos descobrir em qual categoria você está"
				+ "\nDigite sua idade: "));
	
	if(idade >= 10 && idade <= 14) {
		JOptionPane.showMessageDialog(null, "Você se encontra na categoria Infantil");
	}
	else if (idade >= 15 && idade <= 17) {
		JOptionPane.showMessageDialog(null, "Você se encontra na categoria Juvenil");
	}
	else if (idade >= 18 && idade <= 25) {
		JOptionPane.showMessageDialog(null, "Você se encontra na categoria Adulto");
	}
	else {
		JOptionPane.showMessageDialog(null, "Você não se encontra em nenhuma categoria especificada");
	}
	}

}
