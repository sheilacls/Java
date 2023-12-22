package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

public class AppExecoes04 {
	public static void main(String[] args) {
		try {
			String nome = JOptionPane.showInputDialog("Informe seu nome: ");

			// Apresentando o nome em Maiusculo
			JOptionPane.showMessageDialog(null, "Seu nome: " + nome.toUpperCase());
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Sua idade: " + nome);

			/*
			 * Quando tivermos mais de um bloco catch, a ordem em que s�o escritos �
			 * importante. Os mais especificios devem ser os primeiros blocos, pois a busca
			 * pela combina��o ocorre de cima para baixo.
			 */
			// Exce��o String
		} catch (NullPointerException | NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Exce��o Garel: " + ex.getMessage());
		}

	}

}
