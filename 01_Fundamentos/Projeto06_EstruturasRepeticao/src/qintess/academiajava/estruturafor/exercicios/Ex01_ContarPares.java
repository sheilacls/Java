package qintess.academiajava.estruturafor.exercicios;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ex01_ContarPares {
	public static void main(String[] args) {
		/*
		 * Neste programa o usuario escolha um n�mero valor m�nimo e m�ximo. O programa
		 * apresenta a quantidade de n�mero pares existentes entre o minimo e o m�ximo
		 * informados.
		 */
		int min = Integer.parseInt(JOptionPane.showInputDialog("Valor M�nimo: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Valor M�ximo: "));
		// Valida��o do valor minimo que dever� ser menor que o m�ximo.
		if (min >= max) {
			JOptionPane.showMessageDialog(null, "O valor de M�ximo dever� ser maior que o valor M�nimo");
			return;
		}
		int quant = 0; // Variavel que ir� verificar os n�meros pares.
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				quant++;
			}
		}
		// Gerando a resposta
		String resposta = "Entre " + min + " e o " + max + "\nexistem " + quant + " n�meros pares";
		JOptionPane.showMessageDialog(null, resposta);
	}
}
