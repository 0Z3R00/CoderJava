package desafio1Modulo2;

import java.time.LocalDate;

public class PessoaFisica implements ContraCheque {
	private String endereco, nome,  CPF, email, setor;
	private LocalDate dataAdmissao, dataDemissao, ferias;
	private int nit, tipo;
	private double salario, bonificacao;
//	tipos
//	0 funcionario
//	1 supervisor
//	2 gerente
	

	public PessoaFisica(String endereco, String nome, String CPF, String email, String setor,  int nit, double salario,  int tipo) {
		setEndereco(endereco);
		setNome(nome);
		setCPF(CPF);
		setEmail(email);
		setSetor(setor);
		setDataAdmissao();
		setNit(nit);
		setSalario(salario);
		setTipo(tipo);
		setBonificacao();
	}

	public LocalDate getFerias() {
		return ferias;
	}

	public void setFerias(LocalDate ferias) {
		this.ferias = ferias;
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
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
	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
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

	@Override
	public String VerContraCheque() {
		String msg ="";
		double total = getSalario() + (getSalario()*getBonificacao());
		if(getTipo() == 2) {
			
			msg +=  "Gerente: "+getNome()+"\nData de Admissao: "+getDataAdmissao()+ "\nSalario base: "+getSalario()+"\nAtua no setor: "+getSetor()+"\nBonificação: "+getBonificacao()+"\nValor a receber: "+total+"\nNº do NIT: "+getNit();
		}else if(getTipo() == 1){
			msg += "Supervisor: "+getNome()+"\nData de Admissao: "+getDataAdmissao() +  "\nSalario base: "+getSalario()+"\nAtua no setor: "+getSetor()+"\nBonificação: "+getBonificacao()+"%\nValor a receber: "+total+"\nNº do NIT: "+getNit();
		}else {
			msg +=  "Pessoa Fisica: "+getNome()+"\nData de Admissao: "+getDataAdmissao()+"\nSalario base: "+getSalario()+"\nAtua no setor: "+getSetor()+"\nValor a receber: "+total+"\nNº do NIT: "+getNit();
		}
		return msg;
	}

}
