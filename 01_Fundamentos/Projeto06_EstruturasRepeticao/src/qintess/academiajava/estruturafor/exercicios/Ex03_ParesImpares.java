package qintess.academiajava.estruturafor.exercicios;

import javax.swing.JOptionPane;

public class Ex03_ParesImpares {
	public static void main(String[] args) {
		/*
		 * Neste programa o usu�rio informa uma quantidade de n�meros. Em ser�
		 * solicitado a quantidade de n�meros que o usu�rio dever� digitar. - contar a
		 * quantidade de n�meros pares; - contar a quantidade de n�meros impares; -
		 * apresentar a porcentagem de n�meros pares em rela��o aos impares.
		 */

		//JOptionPane.showMessageDialog(null, "*** N�meros Impares e Pares ***");
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Informa a quantidade que ser� digitada? "));
		int par = 0, imp = 0;
		for (int i = 0; i < quant; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero " + (i + 1)));
			if (num % 2 == 0) {
				par++;
			} else {
				imp++;
			}
		}
		double porc = (par / (double) quant) * 100;
		JOptionPane.showMessageDialog(null, "Temos " + porc + "% de n�meros pares");
	}

}
