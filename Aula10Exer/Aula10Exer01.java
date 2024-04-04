package Aula10Exer;

public class Aula10Exer01 {
	public static void main(String[] args) {
		
		int[] numeroInteiro = {1,2,3,4,5};
		
		int soma = numeroInteiro[0] + numeroInteiro[1] + numeroInteiro[2] + numeroInteiro[3] + numeroInteiro[4];
		System.out.println(soma);
		
		int soma2 = 0;
		
		for (int numero : numeroInteiro) {
			soma2 += numero;
		}
		System.out.println(soma2);
		
	}
}