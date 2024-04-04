package Aula09Metodos;

public class Metodo04 {
	public static void main(String[] args) {
		String minhaString = "Texto aleatório";
		String stringMaiuscula = minhaString.toUpperCase();
		String stringMinuscula = minhaString.toLowerCase();
		
		System.out.println("String original: " + minhaString);
		System.out.println("String maiúscula: " + stringMaiuscula);
		System.out.println("String minúscula: " + stringMinuscula);
	}
}