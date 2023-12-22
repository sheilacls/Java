package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {

		/*
		 * Escrever o programa de forma a solicitar ao usu�rio o ano. Com base no ano,
		 * apresentar como resposta se o ano � ou n�o bissexto.
		 * 
		 * Usar o comando IF para esta tarefa.
		 * 
		 */
		// Resposta: O ano � bissexto
		// Resposta: O ano n�o � bissexto

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano para teste: "));
		String resposta;

		if (ano % 4 == 0) {
			resposta = "O ano � BISSEXTO.";
		} else {
			resposta = "O ano n�o � BISSEXTO.";
		}
		System.out.println(resposta);
		JOptionPane.showMessageDialog(null, resposta);
	}

}
