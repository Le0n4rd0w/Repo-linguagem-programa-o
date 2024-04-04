package Aula10Exer;

import java.util.Scanner;

public class Aula10Exer02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[3];

        double[] medias = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i+1));
            System.out.print("Nome: ");
            nomes[i] = leitor.nextLine();

            System.out.print("Nota do 1º bimestre: ");
            double nota1 = leitor.nextDouble();

            System.out.print("Nota do 2º bimestre: ");
            double nota2 = leitor.nextDouble();

            medias[i] = (nota1 + nota2) / 2;

            leitor.nextLine();
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + ": " + medias[i]);
        }

        leitor.close();
	}
}