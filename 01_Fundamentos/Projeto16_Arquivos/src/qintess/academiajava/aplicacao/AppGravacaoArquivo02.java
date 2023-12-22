package qintess.academiajava.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import qintess.academiajava.classes.DocumentoCpf;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.interfaces.Documento;
import qintess.academiajava.utils.Utilitarios;

public class AppGravacaoArquivo02 {
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()	);
			
			FileWriter writer = new 
					FileWriter(Utilitarios.CAMINHO_ARQUIVO + "funcionarios.txt", true);
			
			// obtendo os dados de funcionarios.
			
			while(true) {
				String doc = JOptionPane.showInputDialog("Informe o documento: ");
				Documento documento = new DocumentoCpf(doc); 
				String nome = JOptionPane.showInputDialog("Informe o nome: ");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
				
				Sexo sexo = (Sexo)JOptionPane.showInputDialog(
						null,
						"Selecione o sexo",
						"Sexo",
						JOptionPane.INFORMATION_MESSAGE,
						null,
						Sexo.values(),
						null);
				String cargo = JOptionPane.showInputDialog("Informe o cargo: ");
				double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio: "));
				
				Funcionario funcionario = new Funcionario(
						documento,
						nome,
						idade,
						sexo,
						cargo,
						salario);
				
				// armazenando as informa��es do funcionario no arquivo
				writer.write(funcionario.mostrar() + '\n');
				writer.write(Utilitarios.gerarLinha(50) + '\n');
				
				int opcao = JOptionPane.showConfirmDialog(
						null,
						"Deseja adicionar outro funcionatio",
						"Confirma��o",
						JOptionPane.YES_NO_OPTION);
				if(opcao == JOptionPane.NO_OPTION) {
					
				
					break;
				}	
			}
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo atualizado com sucesso");
			
		} catch (Exception e) {
			Utilitarios.gerarLog(e.toString());
			System.out.println(e.getMessage());
		}
		
	}

}