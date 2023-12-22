package qintess.academiajava.classes;

public class Curso {
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;

	//Construtor
	public Curso(String descricao, int ch, double preco) throws IllegalAccessException, InstantiationException{
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);
	}

	// Getters / Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao == null || descricao.trim().equals("")){
			throw new NullPointerException("Descri��o incorreta");
			
			
		}
		this.descricao = descricao;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) throws IllegalAccessException {
		if(ch <=0) {
			throw new IllegalAccessException("A carga hor�ria � invalida");
		}
		this.ch = ch;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws InstantiationException {
		if(preco < 0) {
			throw new InstantiationException("Pre�o n�o pode ser negativo");
		}
		this.preco = preco;
	}

	public String mostrar() {
		String resultado = "C�digo do curso: " + this.getCodigo() + "\nDescri��o: " + this.getDescricao()
				+ "\nCarga Hor�ria: " + this.getCh() + "\nPre�o: " + this.getPreco();
		return resultado;
	}

}
