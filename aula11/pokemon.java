package aula11;

public class pokemon {
	public String nome;
	public String tipo;
	public String cor;
	public double peso;
	
	public pokemon(String nome, String tipo, String cor, double peso) {
		this.nome = nome;
		this.tipo = tipo;
		this.cor = cor;
		this.peso = peso;
	}
	
	public void brigar() {
		System.out.println("O pokemon " + nome + " do tipo " + tipo + " está lutando. ");
	}
	
	public void comer() {
		System.out.println("O pokemon " + nome + " está comendo e seu peso atual é " + peso + ".");
	}
	
	public void bebendo() {
		System.out.println("Equanto " + nome + " bebia água viu se refelxo, sua cor era " + cor);
	}
	public void comerPlantaMisteriosa() {
		System.out.println("A força do pokemon " + nome + " foi aumentada.");
	}
	
	//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	
	public static void main(String[] args) {
		
		pokemon pikachu = new pokemon("Pikachu" , "Elétrico" , "Amarelo" , 6.8);
		
		pokemon bulbasaur = new pokemon("BulbaSalto" , "Plnanta e Venenoso" , "verde" , 6.9);
		
		pokemon snorlax = new pokemon("PesoPena" , "Normal e Voador" , "Azul Turquesa" , 524.5);
		
		pokemon skitty = new pokemon("skitty" , "Normal e aço" , "Rosa e Amarelo" , 11.2);
		
		//pikachu.comer();
		
		//pikachu.brigar();
		
		//bulbasaur.bebendo();
		
		//bulbasaur.brigar();
		
		//snorlax.comer();
		
		//snorlax.brigar();
		
		//skitty.bebendo();
		
		//skitty.brigar();
		
		//skitty.comerPlantaMisteriosa();
		
		//pikachu.comerPlantaMisteriosa();
	
	}
}
