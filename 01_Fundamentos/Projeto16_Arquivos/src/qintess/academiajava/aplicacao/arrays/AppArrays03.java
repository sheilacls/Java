package qintess.academiajava.aplicacao.arrays;

import javax.swing.JOptionPane;

public class AppArrays03 {
	public static void main(String[] args) {
		/*
		 * Neste exercicio o programa pede para o usuario informar um m�s (1 a 12). De
		 * acordo co o m�s informado o programa mostra o n�mero de dias daquele m�s.
		 * Obs.: vamos tamb�m perguntar o ano para determinar a quatidade de dias do m�s
		 * de fevereiro.
		 */

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));

		int[] meses = { 31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String resposta = "O m�s informado possui: " + meses[mes - 1] + " dias.";
		JOptionPane.showMessageDialog(null, resposta);

	}

}
