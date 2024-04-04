package Aula09Metodos;

public class Metodo05 {
	public static void main(String[] args) {
		String minhaString = "Maça,Banana,Cereija,Damasco";
		
			String[] parteString = minhaString.split(",");

			System.out.println("O primeiro item é: " + parteString[0]);
	}
}