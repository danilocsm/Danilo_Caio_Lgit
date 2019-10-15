package src.hotel;

public class Animal {
	
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome,String tipo,int idade) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setTipo() {
		this.tipo = tipo;
	}
	
	/**
	 * Retorna a representacao em string do animal.
	 * @return string que representa o animal
	 */
	public String toString() {
		return this.nome + " - " + this.idade + " - " + this.tipo;
	}
	
	/**
	 * Retorna o ano de nascimento do animal.
	 * @return ano de nascimento do animal.
	 */
	public int getAnoNascimento() {
		return 2019 - this.idade;
	}
}
