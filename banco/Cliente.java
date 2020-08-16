package banco;

public class Cliente {
	private long numero;
	private String sobrenome;
	private String rg;
	private String cpf;

	public Cliente(long numero, String sobrenome, String rg, String cpf) {
		setNumero(numero);
		setSobrenome(sobrenome);
		setRg(rg);
		setCpf(cpf);
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		if(numero > 0) {
			this.numero = numero;
		}
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if(sobrenome.length() > 0) {
			this.sobrenome = sobrenome;
		}
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		if(rg.length() == 10) {
			this.rg = rg;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length()==11) {
			this.cpf = cpf;
		}
	}
}
