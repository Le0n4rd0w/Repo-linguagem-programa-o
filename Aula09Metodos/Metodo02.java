package Aula09Metodos;

public class Metodo02 {
	public static void main(String[] args) {
		
		String minhaString = "Exemplo";
		
		char primeiroCaractere = minhaString.charAt(0);
		char terceiroCaractere = minhaString.charAt(3);
		
		System.out.println("String original: " + minhaString);
		System.out.println("Primeiro caractere: " + primeiroCaractere);
		System.out.println("Terceiro caractere: " + terceiroCaractere);
	}
}