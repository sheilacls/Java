package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex02_ListaNomes {
	public static void main(String[] args) {
		/*
		 * O usuário informa uma quantidade de nomes.
		 * De acordo com a quantidade informada, o usuaário fornece nomes de pessoas
		 * para o programa.
		 * 
		 * Na medida em que o usuário fornecer os nomes, o programa mostra na tela
		 * apenas os nomes que tiverem mais de 10 caracteres.
		 */
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos nomes vc deseja?"));
		
		for (int i = 0; i < quantidade ; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome " + (i+1) + "/" + quantidade);
			if(nome.length() > 10) {
				System.out.println(nome);
			}
			
		}
		
		
	}

}
