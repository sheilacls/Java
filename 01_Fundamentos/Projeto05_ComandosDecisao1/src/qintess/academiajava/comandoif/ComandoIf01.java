package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		/*
		 * Escrever o programa de forma solicitar ao usuário o ano.
		 * Com base no ano, apresentar como resposta se o ano é ou não bissexto.
		 * 
		 * Usar o comando if para esta tarefa.
		 * 
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		String resposta;
		
		if(ano % 4 == 0) {
			resposta = "O ano é bissexto";
					} else {
			resposta = "O ano não é bissexto";
						
					}
		System.out.println(resposta);
	}

}
