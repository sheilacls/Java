package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
		
	
//Vamos trabalhar com divisão e modulo
	
	//conversão
	double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque"));
	
	//coerção (cast)
	int valorSaque = (int)valor; 
	//Vou pedir pro usuario digitar o valor
	//e desse valor vou pegar a parte inteira por isso (int)valor
	
	if(valorSaque % 5 != 0) {
		JOptionPane.showMessageDialog(null, "O valor deve ser multiplo de 5");
		//return;interrompe a execucao do erro. Ele interrompe a execução do metodo main
		System.exit(0); // Esse quebra a aplicação
	}
	//Se chegar aqui é por que o valor é múltiplo de 5...
		int quant50 = 0, quant20 = 0, quant10 = 0, quant5 = 0;
		quant50 = quant20 = quant10 = quant5 = 0;
		
		quant50 = valorSaque / 50;
		valorSaque = valorSaque % 50;
		
		quant20 = valorSaque / 20;
		valorSaque = valorSaque % 20;
		
		quant10 = valorSaque / 10;
		valorSaque = valorSaque % 10;
		
		quant5 = valorSaque / 5;
		
		//resposta:
		String resposta = "Valor do saque: " + valor +
				"\nNotas de 50: " + quant50 +
				"\nNotas de 20: " + quant20 +
				"\nNotas de 10: " + quant10 +
				"\nNotas de 5: " + quant5;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
