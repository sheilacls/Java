package qintess.academiajava.classes;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Random;

public class Curso implements Comparable<Curso> {

	private final int codigo;
	private String descricao;
	private Integer ch;
	private Double preco;

	// Construtor
	public Curso(String descricao, int ch, double preco) throws IllegalAccessException, InstantiationException {
		// this.setCodigo(codigo);
		Random random = new Random();
		this.codigo = random.nextInt(899) + 100;
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);
	}

	// Getters / Setters
	public int getCodigo() {
		return codigo;
	}

	// public void setCodigo(int codigo) {
//		this.codigo = codigo;
	// }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.trim().equals("")) {
			throw new NullPointerException("Descri��o incorreta");

		}
		this.descricao = descricao;
	}

	public Integer getCh() {
		return ch;
	}

	public void setCh(int ch) throws IllegalAccessException {
		if (ch <= 0) {
			throw new IllegalAccessException("A carga hor�ria � invalida");
		}
		this.ch = ch;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws InstantiationException {
		if (preco < 0) {
			throw new InstantiationException("Pre�o n�o pode ser negativo");
		}
		this.preco = preco;
	}

	public String mostrar() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("C�digo do curso:")
			.append(this.getCodigo())
			.append("\nDescri��o: ")
			.append(this.getDescricao())
			.append("\nCarga Hor�ria: ")
			.append(this.getCh())
			.append("\nPre�o: ")
			.append(this.getPreco());
		
		return sb.toString();
	}

	@Override
	public int compareTo(Curso o) {
		return this.getDescricao().compareTo(o.getDescricao());
	}

	@Override
	public int hashCode() {
		return this.getDescricao().toLowerCase().hashCode() + this.getCh().hashCode() + this.getPreco().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Curso) {
			Curso curso = (Curso)obj;
			if(this.getDescricao().equalsIgnoreCase(curso.getDescricao())
					&& this.getCh().equals(curso.getCh())
					&& this.getPreco().equals(curso.getPreco())){
						return true;
				}
			}
		return false;
	}

	@Override
	public String toString() {
		Formatter fmt = new Formatter();
		DecimalFormat df = new DecimalFormat(",##0.00");
		
		String resposta = fmt.format("%-6d %-30s %-3d %12s%n", 
				this.getCodigo(), 
				this.getDescricao(), 
				this.getCh(), 
				df.format(this.getPreco())).toString();
		
		fmt.close();
		return resposta;
	}

	
	
}
