package qintess.academiajava.estruturawhile.exercicios;

import javax.swing.JOptionPane;

public class Ex02_AdvinhaNumero {
	public static void main(String[] args) {

		/*
		 * O programa deve gerar um numero aleatorio entre 1 e 100. Em um processo
		 * repetitivo o usuario tenta advinhar o n�mero. Quando o usuario acertar o
		 * programa mostra o n�mero de tentativas.
		 * 
		 * Exemplo de execu��o:
		 * 
		 * 1. Considere que tenha sido gerado o n�mero 45. 2. Na primeira itera��o o
		 * programa solicita:
		 * 
		 * "Informe um n�mero entre: 1 e 100".
		 * 
		 * 3. O usuario digita 50 (acima do valor gerado) 4. Na pr�xima itera��o o
		 * programa solicita:
		 * 
		 * "Informe um n�mero entre: 1 e 49".
		 * 
		 * 5. O usuario digita: 20 (abaixo do numero gerado) 6. Na pr�xima itera��o o
		 * programa solicita:
		 * 
		 * "Informe um n�mero entre: 21 e 49".
		 * 
		 * 7. E assim sucessivamente at� o usu�rio acertar.
		 * 
		 */

		int numero = (int) (Math.random() * 100) + 1; // numero entre 1 e 100
		int max = 100, min = 1;
		int tentativas = 0;

		while (true) {
			tentativas++;

			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor entre: " + min + " e " + max));
			if (valor < min || valor > max) {
				continue;
			}

			if (valor < numero) {
				min = valor + 1;
			} else if (valor > numero) {
				max = valor - 1;
			} else {
				break;
			}

		}
		JOptionPane.showMessageDialog(null, "Voc� acertou em " + tentativas + " tentativas");

	}

}
