package musica.piu;

import java.util.Arrays;
import java.util.List;

public class MusicaPiu {

	public static void main(String[] args) {
		
		List<Animal> animais = Arrays.asList(
				new Pintinho(),
				new Galo(),
				new Galinha(),
				new Cachorro(),
				new Gato()
		);
		
		for (int i = 0; i < animais.size(); i++) {
			Animal atual = animais.get(i);
			
			System.out.println("Lá em casa tinha um " + atual.getNome());
			System.out.println("Lá em casa tinha um " + atual.getNome());
			
			if (i == 0 && atual instanceof Pintinho) {
				atual.cantarRefrao(6);
			} else {
				atual.cantar();
			}
			
			for (int j = i - 1; j >= 0; j--) {
				Animal anterior = animais.get(j);
				
				if (anterior instanceof Pintinho) {
					int vezes = switch (i) {
						case 1 -> 5;
						case 2 -> 4;
						case 3 -> 4;
						case 4 -> 4;
						 default -> 0;
					};
					
					anterior.cantarRefrao(vezes);
				} else {
					anterior.cantar();
				}
			}
			
			System.out.println();
			
		}

	}

}
