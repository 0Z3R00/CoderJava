package banco;

public class Poupanca extends Conta{
	private double taxa;
	
	public Poupanca(Cliente cliente, double taxa){
		super(cliente);
		setTaxa(taxa);
		
	}
	
	public void setTaxa(double taxa) { 
		if(taxa > 0) {
			this.taxa = taxa;
		}
	}
	
	public double getTaxa(){
		return taxa;
	}
	
	@Override
	public  void RecolherJuros(){
		double total = super.getSaldo()*getTaxa();
		super.Depositar(total);
	}
	

}
