package Aula09Metodos;

public class Metodo06 {
	public static void main(String[] args) {
		
		String string01 = "Nação Fontaine";
		String string02 = "Furina";
		String string03 = "Nação Fontaine";
		
		boolean verificarStringIgual = string01.equalsIgnoreCase(string02);
		System.out.println("A string 1 é igual a string 2?: " + verificarStringIgual);
		
		boolean comecaComFurina = string01.startsWith(string02);
		boolean terminaComFontaine = string01.endsWith(string03);
		
		System.out.println("A string 2 começa com Nação?: " + comecaComFurina);
		System.out.println("A string 3 termina com Fontaine?: " + terminaComFontaine);
	}
}