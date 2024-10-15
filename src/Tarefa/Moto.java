package Tarefa;

// Classe representando uma moto real

public class Moto {
	
	// Atributos da moto
	
	private String modelo;
	private String cor;
	private String cilindrada;
	private int ano;	

	// COnstrutor com os atributos da moto
	
	public Moto(String modelo, String cor, String cilindrada, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.cilindrada = cilindrada;
		this.ano = ano;
	}
	

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}

	// Método para exibir ficha tecnica da moto
	
	public void fichaTecnica() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Cilindrada: " + cilindrada);
		System.out.println("Ano: " + ano);
	}

	// Método para testar a classe Moto

	public static void main(String[] args) {
		
		Moto moto = new Moto("XJ6", "Branca", "600cc", 2012);
		
		moto.fichaTecnica();

	}

}
