package musica.piu;

public abstract class Animal {
	private String nome;
	private String som;
	
	public Animal(String nome, String som) {
		this.nome = nome;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}
	
	public String getSom() {
		return som;
	}

	public void cantar() {
		System.out.println("E o " + nome + " " + som);
	
	}
	
	public void cantarRefrao(int vezes) {
		for (int i = 0; i < vezes; i++) {
			cantar();
		}
	}
	
}
