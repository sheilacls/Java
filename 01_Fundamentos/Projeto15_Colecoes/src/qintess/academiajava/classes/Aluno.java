package qintess.academiajava.classes;

import java.util.Formatter;
import java.util.List;

import qintess.academiajava.enumeracoes.Sexo;
import qintess.academiajava.utils.Utilitarios;

public class Aluno extends Pessoa {
	private int matricula;
	private List<Curso> cursos;

	public Aluno(String nome, int idade, Sexo sexo, int matricula) throws IllegalAccessException {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
	}

	public Aluno(String nome, int idade, Sexo sexo, int matricula, List<Curso> cursos) throws IllegalAccessException {
		this(nome, idade, sexo, matricula);
		this.setCursos(cursos);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String mostrar() {
		StringBuilder sb = new StringBuilder()
			.append(super.mostrar())
			.append("\nMatricula: ")
			.append(this.getMatricula());
		
		return sb.toString();
	}

	public String listarCursos() {
		String conteudo;
		if (this.getCursos() == null || this.getCursos().size() == 0) {
			conteudo = "Nenhum curso encontrado";
		} else {
			// Cabe�alho
			Formatter fmt = new Formatter();
			String cabecalho = fmt.format("%-6s %-30s %-3s %12s%n", 
					"CODIGO", "DESCRI��O", "CH", "PRE�O").toString();
			
			
			String linha = Utilitarios.gerarLinha(cabecalho.length() -2 );
			
			StringBuilder sb = new StringBuilder(linha)
					.append('\n')
					.append(cabecalho)
					.append(linha)
					.append('\n');
					
			for (Curso curso : this.getCursos()) {
				sb.append(curso);
			}
			fmt.close();
			conteudo = sb.toString();
		}
		return conteudo;
	}
}
