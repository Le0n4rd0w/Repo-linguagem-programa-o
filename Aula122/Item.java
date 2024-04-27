package Aula122;

public class Item {
	//Definindo atributos
	String joy;
	int quantidade;
	double preco;
	
	//Construtor da classe
	public Item(String joy, int quantidade, double preco) {
		this.joy = joy;
		this.quantidade =  quantidade;
		this.preco = preco;
	}
	
	public String toString() {
		return "Item: " + joy + " Quantidade: " + quantidade + " Preço (R$): " + String.format("%.2f", preco);
	}
}