package Interface;

public class TorreDeControle {
	private Voador[] voadores = new Voador[3];
	
	public TorreDeControle(Voador pato, Voador aviao, Voador superhomem) {
		voadores[0] = pato;
		voadores[1] = aviao;
		voadores[2] = superhomem;
	}
	
	public void voemTodos() {
		for(int i = 0; i < voadores.length; i++) {
			voadores[i].voar();
		}
	}
}
