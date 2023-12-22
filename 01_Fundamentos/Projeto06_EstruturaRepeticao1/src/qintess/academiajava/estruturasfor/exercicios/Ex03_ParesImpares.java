package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex03_ParesImpares {
	public static void main(String[] args) {
		/*Neste exercicio o usupario informa uma quantidade de numeros
		 * 
		 * Em seguida ele digita esses numeros (se for informado 10 numetos.
		 * o usupario deve fornecer valor para cada um dos 10 numeros.
		 * Na medida em que os numeros forem digitados, o programa deve:
		 * -contar a quantidade de números pares
		 * -contar a quantidade de nújmeros impares
		 * - apresentar a porcentagem de numeros pares em relação aos impares.
		 */
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de num. "));
		int pares = 0, impares = 0;
		
		for(int i = 0; i < quantidade; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (i+1)));
			if(numero % 2 ==0) {
				pares++;
		
			}else {
				impares++;
				
			}
		}
		double porcentagem = (pares / (double)(impares = pares)) * 100; //Typecast, ou seja converter em procentagem
		JOptionPane.showMessageDialog(null, "Temos " + porcentagem + "% de numeros pares");
		
	}

}
