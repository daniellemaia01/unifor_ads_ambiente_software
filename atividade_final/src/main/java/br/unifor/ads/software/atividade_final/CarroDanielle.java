//classe Danielle 5

package br.unifor.ads.software.atividade_final;

public class CarroDanielle {

	// Atributos

	private String nome;
	private String marca;
	private String cor;
	private boolean ligar;

	// Métodos Especiais

	public CarroDanielle(String nome, String marca, String cor, boolean ligar) {

		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.ligar = ligar;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigar() {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	// Métodos

	public void status() {
		System.out.println(this.nome);
		System.out.println(this.marca);
		System.out.println(this.cor);
		System.out.println(this.ligar);

	}

	public void ligarCarro() {
		this.ligar = true;
	}

	// Método principal

	public static void main(String[] args) {

		// Testando meus métodos
		CarroDanielle d1 = new CarroDanielle("Tracker", "Chevrolet", "Branco", false);
		d1.ligarCarro();
		d1.status();

		// Chamando métodos da Classe MotorMarcia

		MotorMarcia m1 = new MotorMarcia("Flex", 116);
		System.out.println(m1.getPotencia());

		// Chamando método criado por Danielle na classe MotorMarcia

		m1.statusMotor();
	}

	// Método Márcia

	public void CarroDanielle() {

		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Nome " + this.nome);

	}
}



