package src.hotel;

public class Estadia {

	private Animal animal;
	private int dias;
	private double valor;
	
	
	public Estadia(Animal animal,int dias,double valor) {
		this.animal = animal;
		this.dias = dias;
		this.valor = valor;
	}
	
	public int getDias() {
		return dias;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getNome( ) {
		return this.animal.getNome();
	}
	
	public String getTipo() {
		return this.animal.getTipo();
	}
	
	public int getIdade() {
		return this.animal.getIdade();
	}
	
	public void setDias() {
		this.dias =  dias;
	}
	
	public void setNome() {
		this.nome =  nome;
	}
	
	@Override
	public String toString() {
		String output = getNome() + ", " + getTipo() + ", " + this.dias + " dias com o preço de " + this.valor;
		return output;
	}
	
	
}
