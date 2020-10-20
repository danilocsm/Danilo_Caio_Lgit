package hotel;

public class Hotel {
	Recepcao recepcao;
	int qtdEstrelas;
	
	public Hotel() {
		this.recepcao = new Recepcao();
		this.qtdEstrelas = 1;
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		this.recepcao.checkIn(nome, tipo, idade, dias, valor);
	}
	
	public void checkOut(String nome) {
		this.recepcao.checkOut(nome);
	}
	
	public int getNumDeHospedes() {
		return this.recepcao.getNumDeHospedes();
	}
	
	public double getLucroTotal() {
		return this.recepcao.getLucroTotal();
	}

	@Override
	public String toString() {
		return this.recepcao.toString();
	}
	
	public void avaliarHotel() {
		this.qtdEstrelas += 1;
	}
	
	
}
