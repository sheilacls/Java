package qintess.academiajava.leitura;

import javax.swing.JOptionPane;

public class DadosProduto {
	public static void main(String[] args) {
/*
 * Solicitar os seguintes dados do produto:
 * 
 * - Marca (String)
 * - Descri��o (String)
 * - Categoria (String)
 * - Ano de Fabrica��o (int)
 * - Pre�o do Produto (double)
 * - Quantidade (double)
 * - Valor Total (double) 
 * 
 * Exemplo: Adidas, Camiseta, 2021, 45.0, 2.0, 90.0 
 */
		
		String marca = JOptionPane.showInputDialog("Informe a marca do Produto:");
		String descricao = JOptionPane.showInputDialog("Informe a descricao do Produto:");
		String categoria = JOptionPane.showInputDialog("Informe a categoria do Produto:");
		
		int anoFab = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabrica��o do Produto:"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do Produto:"));
		double quant = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do Produto:"));
		double total = preco * quant;
		
		// Gerando a resposta
		String resposta = "Marca: " + marca + "\nDescri��o: " + descricao + "\nCategoria: " + categoria + 
				"\nAno de Fabrica��o: " + anoFab + "\nPre�o: " + preco + "\nQuantidade: " + quant + 
				"\nTotal das compras:" + total;
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
	}

}
