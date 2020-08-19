package Interface;

public class Aviao implements Voador {
	private int horasDeVoo = 0; 

	@Override
	public void voar() {
		horasDeVoo+=13;
		System.out.println("Estou voando como um avião, tenho "+ horasDeVoo +" horas de voo");

	}

}
