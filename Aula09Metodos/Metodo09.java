package Aula09Metodos;

public class Metodo09 {
	public static void main(String[] args) {
		
		String minhaString = "Exemplo de string";
	
		for (int i = 0 ; i < minhaString.length() ; i++) {
			char quantidadeCaractere = minhaString.charAt(i);
			System.out.println("A quantidade de caractere é: " + quantidadeCaractere);
		}
		System.out.println("\nA quatidade de caracteres total da string é: " + minhaString.length());
		
		String minhaString02 = "\nSegundo exemplo";
		
		for (char caractere : minhaString02.toCharArray()) {
			System.out.println(caractere);
		}
		System.out.println("\nA quatidade de caracteres total da string é: " + minhaString02.length());
	}
}