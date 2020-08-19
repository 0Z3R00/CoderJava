package Interface;

public class Pato implements Voador {
	private int energia = 100; 

	@Override
	public void voar() {
		energia = energia - 5;
		
		if(energia > 0) {
			System.out.println("Estou voando como um pato");
		}else {
			System.out.println("Não tenho energia suficiente para voar");
		}
	}

}
