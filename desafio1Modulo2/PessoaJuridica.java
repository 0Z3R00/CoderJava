package desafio1Modulo2;

import java.time.LocalDate;

public class PessoaJuridica implements ContraCheque {
	private String endereco, nome,  CNPJ, email, setor;
	private LocalDate dataAdmissao, dataDemissao, ferias;
	private int tipo;
	private double salario, bonificacao;
//	tipos
//	0 funcionario
//	1 supervisor
//	2 gerente
	

	public PessoaJuridica(String endereco, String nome, String CNPJ, String email, String setor,  double salario,  int tipo) {
		setEndereco(endereco);
		setNome(nome);
		setCNPJ(CNPJ);
		setEmail(email);
		setSetor(setor);
		setDataAdmissao();
		setSalario(salario);
		setTipo(tipo);
		setBonificacao();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao() {
		LocalDate localDate = LocalDate.now();
		this.dataAdmissao = localDate;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao() {
		LocalDate localDate = LocalDate.now();
		this.dataDemissao = localDate;
	}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao() {
		if(getTipo() == 2) {
			bonificacao = 0.12;
		}else if(getTipo() == 1) {
			bonificacao = 0.08;
		}else {
			bonificacao = 0;
		}
		
	}
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFerias() {
		return ferias;
	}

	public void setFerias(LocalDate ferias) {
		this.ferias = ferias;
	}

	@Override
	public String VerContraCheque() {
		return  "Pessoa Juridica: "+getNome()+"\nData de Admissao: "+getDataAdmissao()+"\nSalario base: "+getSalario()+"\nAtua no setor: "+getSetor();
	}

}
