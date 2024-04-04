package Aula09Exercicios;

public class Exer07 {
	public static void main(String[] args) {
		
		String texto = "teste 123";
	    
		System.out.println("String original: " + texto);
		
		System.out.println("\nString sem espaços sobrando: " + texto.trim() );
		
		texto = texto.replaceAll("\\s+", " ");
		System.out.println("\n" + texto);
		
	}
}