package Aula09Metodos;

public class Metodo03 {
	public static void main(String[] args) {
		
		String minhaString = "Exemplo de string";
		int indice = minhaString.indexOf("string");
		int indice2 = minhaString.indexOf("Java");
		
		System.out.println("String original: " + minhaString);
		System.out.println("Posição do indice 1: " + indice);
		System.out.println("Posição do indice 2: " + indice2);
		
		String stringAntiga = "Essa é a string antiga";
		String stringNova = stringAntiga.replace('a' , 'X');
		
		System.out.println("A string antiga: " + stringAntiga);
		System.out.println("A string nova: " + stringNova);
	}
}