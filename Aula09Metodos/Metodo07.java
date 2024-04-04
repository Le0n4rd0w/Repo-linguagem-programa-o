package Aula09Metodos;

public class Metodo07 {
	public static void main(String[] args) {
		
		String nome = "Sabrina";
		int idade = 22;
		
		String mensagem = String.format("Olá, meu nome é %s e eu tenho %d anos", nome, idade);
		System.out.println(mensagem);
		
		double valorAleatorio = 455.48367;
		String valorFormatado = String.format("O valor é %.2f", valorAleatorio);
		System.out.println(valorFormatado);
		
		String texto = "     texto aleatório     ";
		String textoTrimmed =  texto.trim();
		System.out.println("\nTexto original: " + texto + "\ntexto sem os espaços iniciais e finais: " + textoTrimmed);
	}
}