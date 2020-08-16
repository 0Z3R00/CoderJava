package banco;

public class Corrente  extends Conta {
	private double limite;
	
	public Corrente(Cliente cliente, double limite) {
		super(cliente);
		setLimite(limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String Sacar(double valor) {
		if(valor > 0 && super.getSaldo() >= valor) {
				super.setSaldo(super.getSaldo() - valor);
				return "Sacou o valor de "+valor;
		}else if((this.limite + super.getSaldo()) >= valor) {
			super.setSaldo(this.limite + super.getSaldo());
			super.setSaldo(super.getSaldo() - valor);
			return "Você realizou um saque utilizando o valor do seu limete aprovado";
		}
		return "Valor do saque é deve ser maior que 0";
	}
	
	@Override
	public String DepositoCheque(Cheque cheque) {
		super.Depositar(cheque.getValor());
		return "Foi realizado um deposito em cheque no valor de R$"+cheque.getValor()+", emitido pelo banco "+cheque.getBanco()+", com data de vencimento para "+cheque.getDataNascimento();
	}
	

}
