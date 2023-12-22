package qintess.academiajava.exercicios1;

import javax.swing.JOptionPane;

public class Ex02_Bissexto {
	public static void main(String[] args) {
		
	}
	/*O programa solicita o ano para o usuário.
	 * Com base no ano informado, apresentar na tela se este ano é
	 * ou não bissexto.
	 * 
	 * Obs: Para o ano bissexto, ele deve ser divisivel por 4.
	 */
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
	
	//Resposta 1:
	String resposta = ano % 4 == 0 ? " O ano é bissexto": "O ano não é bissexto";
	
	System.out.println(ano % 4 == 0);

}
