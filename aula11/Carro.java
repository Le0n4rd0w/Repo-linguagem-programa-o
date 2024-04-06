package aula11;

public class Carro {
		
	public String marca; //Atributo (Tipo do dado e o nome)
	public String cor;
	
	public Carro(String marca, String cor) { //Construtor é a ordem de criação
		this.marca = marca;
		this.cor = cor;
	}
	
	public void ligarCarro() { //Método é oque pode fazer
		System.out.println("O carro da marca " + marca + " está ligado");
	}
	
	public void mostrarCor() {
		System.out.println("A cor do carro é: " + cor);
	}
}
