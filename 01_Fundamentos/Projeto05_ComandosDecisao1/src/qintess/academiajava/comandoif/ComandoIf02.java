package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/*
		 * Em uma empresa o funcionario tem um valor descontado do seu salario
		 * somente se o seu salario for maior que 5.000,00.
		 * 
		 * O desconto ocorre da seguinte forma:
		 * 
		 * - At� 5.000,00 nada � descontado.
		 * - Acima de 5.000,00 desconto de 10% sobre o que passar de 5.000,00
		 * 
		 * Exemplo: Salario de 5.500,00, desconto de 10% sobre 500,00
		 * 
		 */
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario"));
		double desconto=0;
		
		if (salario > 5000) {
			desconto = (salario - 5000) * 10 / 100; // ou * 0.1;	
			
		}
		// Construindo a resposta
		String resposta = "Salario bruto " + salario +
				"\nDesconto: " + desconto +
				"\nsalario Liquido: " + (salario - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
