package qintess.academiajava.exercicios1;

import javax.swing.JOptionPane;

public class Ex02_Bissexto {
	public static void main(String[] args) {
		
	}
	/*O programa solicita o ano para o usu�rio.
	 * Com base no ano informado, apresentar na tela se este ano �
	 * ou n�o bissexto.
	 * 
	 * Obs: Para o ano bissexto, ele deve ser divisivel por 4.
	 */
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
	
	//Resposta 1:
	String resposta = ano % 4 == 0 ? " O ano � bissexto": "O ano n�o � bissexto";
	
	System.out.println(ano % 4 == 0);

}
