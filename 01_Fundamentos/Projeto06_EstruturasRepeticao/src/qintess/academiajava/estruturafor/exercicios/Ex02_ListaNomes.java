package qintess.academiajava.estruturafor.exercicios;
import javax.swing.JOptionPane;

public class Ex02_ListaNomes {
	public static void main(String[] args) {
		/*
		 * O usuario informa que quantidade de nomes. De acordo com a quantidade
		 * informada o usu�rio fornece nomes de pessoas para o programa. � medida que o
		 * usu�rio fornece os nomes o programa ir� mostrar na tela apenas os nome que
		 * tiverem
		 * 
		 */
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos nomes voc�s deseja? "));
		for (int i = 0; i < quant; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome: " + (i + 1) + "/" + quant);
			if (nome.length() > 10) {
				System.out.println(nome);
			}

		}
	}
}
