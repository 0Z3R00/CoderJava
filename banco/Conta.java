package banco;

public class Conta {
    private double saldo;
    private Cliente cliente;
    
    public Conta(Cliente cliente) {
    	setCliente(cliente);
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void Depositar(double valor) {
		if(valor > 0) {
			setSaldo(getSaldo()+valor);
		}
	}
	
	public String Sacar(double valor) {
		if(valor > 0) {
			if(saldo >= valor) {
				setSaldo(getSaldo() - valor);
				return "Sacou o valor de "+valor;
			}else {
				return "O seu saldo atual é menor que o valor do saque";
			}
		}
		return "Valor do saque é deve ser maior que 0";
	}
	
	public String Consultar() {
		return "Saldo da sua conta é de "+ getSaldo();
	}
	
	public void RecolherJuros() {}

	public String DepositoCheque() {
		return null;
	}

	public String DepositoCheque(Cheque cheque) {
		// TODO Auto-generated method stub
		return null;
	};
}
