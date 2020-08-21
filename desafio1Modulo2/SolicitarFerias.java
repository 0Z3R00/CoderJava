package desafio1Modulo2;

import java.time.LocalDate;

public class SolicitarFerias {
	private LocalDate dataSolicitacao, dataAdmissao, ferias;




	public SolicitarFerias(LocalDate dataSolicitacao, LocalDate dataAdmissao, LocalDate ferias) {
		setDataAdmissao(dataAdmissao);
		setDataSolicitacao(dataSolicitacao);
		setFerias(ferias);
	}


	public String Aprova() {

		if(getDataAdmissao().isBefore(getDataSolicitacao())) {
			LocalDate localDate4 = getDataSolicitacao().minusMonths(11);
			if(getDataAdmissao().isBefore(localDate4)|| getDataAdmissao().isEqual(localDate4)) {
				if(getFerias()== null) {
					return "Ferias Aprovada"; 
				}else {
					LocalDate localDate3 = getDataSolicitacao().minusMonths(4);
					if(getFerias().isBefore(localDate3)|| getFerias().isEqual(localDate3)) {
						return "Ferias Aprovada";
					}else
						return "Ferias negada";
				}
			}
		}
		return "Ferias negada";

	}

	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}


	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}


	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public LocalDate getFerias() {
		return ferias;
	}


	public void setFerias(LocalDate ferias) {
		this.ferias = ferias;
	}


}
