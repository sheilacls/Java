package qintess.academiajava.exercicios1;

import javax.swing.JOptionPane;

public class Ex01_minutos {
	public static void main(String[] args) {
		/*
		 * Neste exercicio o usuario fornece uma quantidade de
		 * minutos
		 * Com base nos minutos informados, o programa mostra quantas
		 * horas exatas aqueles minutos possuem, e os minutos complementares.
		 * 
		 * 
		 * Para esta tarefa, usaremos duas opera��es:
		 * *Divis�o inteira (Quando os operadores s�o iguais) (/)
		 * *Resto da Divis�o (%)
		 */
		
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos:"));
		int horas = minutos / 60;
		int minutosRestantes = minutos % 60;
		System.out.println("Horas exatas: " + horas);
		System.out.println("Minutos restantes: " + minutosRestantes);
	
	}

}
