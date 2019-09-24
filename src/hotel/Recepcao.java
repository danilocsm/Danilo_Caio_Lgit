package hotel;

import java.util.ArrayList;

public class Recepcao {
	private ArrayList<Estadia> estadias;

	public Recepcao() {
		this.estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Animal novoAnimal = new Animal(nome, tipo, idade);
		Estadia novaEstadia = new Estadia(novoAnimal, dias, valor);
		this.estadias.add(novaEstadia);
	}

	public void checkOut(String nome) {
		for(Estadia estadia: this.estadias) {
			if(estadia.getNome().equals(nome)) this.estadias.remove(estadia);
		}
	}
	
	public int getNumDeHospedes() {
		return this.estadias.size();
	}
	
	public double getLucroTotal() {
		double lucro = 0;
		for(Estadia estadia: this.estadias) {
			lucro += estadia.getValor();
		}
		return lucro;
	}

	@Override
	public String toString() {
		String output = "Estadias:\n";
		for(Estadia estadia: this.estadias) {
			output += estadia.getNome() + " (" + estadia.getTipo() + "): " + estadia.getDias() + 
					" dias com o preço de R$ " + estadia.getValor() + "\n";
		}
		return output;
	}
}
