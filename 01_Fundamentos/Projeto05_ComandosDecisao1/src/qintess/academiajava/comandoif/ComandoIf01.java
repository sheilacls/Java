package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		/*
		 * Escrever o programa de forma solicitar ao usu�rio o ano.
		 * Com base no ano, apresentar como resposta se o ano � ou n�o bissexto.
		 * 
		 * Usar o comando if para esta tarefa.
		 * 
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		String resposta;
		
		if(ano % 4 == 0) {
			resposta = "O ano � bissexto";
					} else {
			resposta = "O ano n�o � bissexto";
						
					}
		System.out.println(resposta);
	}

}
