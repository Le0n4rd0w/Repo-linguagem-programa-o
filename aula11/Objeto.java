package aula11;

public class Objeto {
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro("toyota","Amarelo");
		//Carro meuCarro = new Carro("Amarelo");
		
		meuCarro.ligarCarro();
		meuCarro.mostrarCor();
	}
}
