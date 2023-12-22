package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex01_ContarPares {
	public static void main(String[] args) {
		/*
		 * Neste programa, o usu�rio escolhe um valor minimo e um valor
		 * maximo. O programa apresenta a quantidade de n�meros pares
		 * existentes entre o m�nimo e o m�ximo informados.
		 */
		
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Valor minimo: "));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Valor M�ximo: "));
		
		// Vamos fazer uma valida��o. Validando se o m�nimo � menor que o m�ximo
		if(minimo >= maximo) {
			JOptionPane.showMessageDialog(null, "O valor m�ximo dever� ser maior que o m�nimo");
			return;
		}
		
		int quantidade = 0; //variavel que representara a qtdade de numeros pares
		
		for (int i = minimo; i <= maximo; i++) {
			if(i % 2 == 0) {
				quantidade++;
				
			}
			//gerando a resposta
			String resposta = "Entre " + minimo + " e " + maximo +
					"existem " + quantidade + "n�meros pares";
			JOptionPane.showMessageDialog(null, resposta);
		}
		
	}
}
