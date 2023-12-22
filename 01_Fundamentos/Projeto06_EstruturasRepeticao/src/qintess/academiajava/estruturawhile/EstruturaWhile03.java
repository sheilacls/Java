package qintess.academiajava.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	public static void main(String[] args) {

		/*
		 * O usuario fornece uma certa quantidade de numeros. O numero sera mostrado na
		 * tela somente se for positivo. Se o usario informar 0 (zero), finaliza a
		 * aplica��o.
		 */

		while (true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));
			if (numero == 0) {
				break;
			}
			if (numero < 0) {
				JOptionPane.showMessageDialog(null, "N�o foi possivel continuar. \nDigite o n�mero novamente.");
				continue;
			}
			System.out.println(numero);
		}
		System.out.println("--- FIM DO PROGRAMA ---");
	}

}
