package banco;

public class Cheque {
	private double valor;
	private String banco;
	private String dataNascimento;
	
	public Cheque(double valor, String banco, String dataNascimento) {
		setValor(valor);
		setBanco(banco);
		setDataNascimento(dataNascimento);
		
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		if(banco.length() > 0) {
			this.banco = banco;
		}
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.length()==10) {
			this.dataNascimento = dataNascimento;
		}
	}
}
