package src.hotel;

public class Animal {
	
	private String nome;
	private String tipo;
	private int idade;
	private String cor;
	
	public Animal(String nome,String tipo,int idade, String cor) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.cor = cor;
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
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String corNova) {
		this.cor = corNova;
	}
}
