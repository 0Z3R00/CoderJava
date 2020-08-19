package Interface;

public class TestandoVoador {
	public static void main(String[] args) {
		//Testando metodo voar do pato
		Voador patinho = new Pato();
		Voador aviao = new Aviao();
		Voador superMan = new SuperHomem();
		
		TorreDeControle torre = new TorreDeControle(patinho, aviao, superMan);
		
		for(int i = 0; i < 20; i++ ) {
			torre.voemTodos();
		}
	
	}
}
