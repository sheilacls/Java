package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex01_minutos {
	public static void main(String[] args) {
/*
 * Neste exercicio o usu�rio fornece uma quantidade de minutos.
 * Com base nos minutos informados, o programa mostra quantas horas
 * exatas foram digitados.
 * 
 * Com base nos minutos informados, o programa mostra quantas horas 
 * exatas aqueleminutos possuem e os minutos complementares.
 * 
 * Para esta tarefa usaremos opera��es:
 * - Divis�o Inteira (/)
 * - Resto da Divis�o (%)
 * 		
 */
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos"));
		int horas = minutos / 60;
		int minutRestantes = minutos % 60;
		//System.out.println("Horas exatas: " + horas);
		//System.out.println("Minutos restantes: " + minutRestantes);
		JOptionPane.showMessageDialog(null, "Horas Exatas: " + horas + "\nMinutos: " + minutRestantes);
		
		
		
		
		
	}

}
