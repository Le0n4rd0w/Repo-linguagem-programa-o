package Aula09Exercicios;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nome = scanner.nextLine();
		
		String[] partes = nome.split(" ");
	
		System.out.println("Seu primeiro nome é: " + partes[0]);
		scanner.close();
		}
}