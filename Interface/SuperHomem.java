package Interface;

public class SuperHomem implements Voador {
	private int experiencia = 0; 

	@Override
	public void voar() {
		experiencia+=3;
		System.out.println("Estou voando como um campeão, minha Experiência é de "+experiencia);
	}
}