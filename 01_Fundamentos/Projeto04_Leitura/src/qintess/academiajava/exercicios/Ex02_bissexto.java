package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex02_bissexto {
	public static void main(String[] args) {
		/*
		 * Programa solicita o ano ao usu�rio.
		 * Com base no valor informado verificar 
		 * se o ano � bissexto ou n�o.
		 * 
		 * Obs.: Para o ano ser bissexto ele deve ser divisivel por 4.
		 */
		
/*
 * 10 / 3 = 3 (Divisor)
 * 10 % 3 = 1 (Resto)
 * >  Maior
 * <  Menor
 * >= Mais igual �...
 * <= Menos igual �...
 * == Igual
 * != Diferente
 * 	
 * 	int x = 2; (atribui��o)
 *  x == 2 ? (true)
 *  x > 0 ? (true)
 *  x <= 2 ? (true)
 *  x != 2 ? (false)
 *  
 *  
 */
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o ANO: "));
		
		// Resposta 1 -> Operador Tern�rio: 
		String resposta = ano % 4 == 0 ? "O ano � bissexto" : "O ano n�o � bissexto";
		System.out.println(resposta);
		//JOptionPane.showMessageDialog(null, resposta);
		
		//Resposta 2 -> Operador Tern�rio:
		System.out.println(ano % 4 == 0 ? "O ano � bissexto" : "O ano n�o � bisexto");
					
	}

}
