package desafio1Modulo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestandoPessoa {

	public static void main(String[] args) {
		PessoaFisica pessoaF = new PessoaFisica("Itaquaquecetuba,SP", "Matheus", "33344433322", "moura@moura.com", "TI", 1, 1600, 0);
		PessoaFisica pessoaf1 = new PessoaFisica("Suzano,SP", "Fabio", "33344433322", "fabio@fvv.com", "RH", 3, 1800, 1);
		PessoaFisica pessoaf2 = new PessoaFisica("Poá,SP", "Luciana", "33344433322", "lulu@ggvv.com", "TI", 4, 5800, 2);
		PessoaJuridica pessoaJ = new PessoaJuridica("São paulo", "Vanessa","00145534443","v@gmail.com", "Comunicação", 1888, 0);
		
		System.out.println(pessoaF.VerContraCheque());
		System.out.println("=============================================================");
		System.out.println(pessoaJ.VerContraCheque());
		System.out.println("=============================================================");
		System.out.println(pessoaf1.VerContraCheque());
		System.out.println("=============================================================");
		System.out.println(pessoaf2.VerContraCheque());
		
		//data de solicitação
		LocalDate dataPF = LocalDate.of(2021, 11, 10);
		//objeto Solicitaferias 
		SolicitarFerias sfPF = new SolicitarFerias(dataPF, pessoaF.getDataAdmissao(), pessoaF.getFerias());
		System.out.println(sfPF.Aprova());
		
		
		LocalDate dataPJ = LocalDate.of(2021, 11, 20);
		//alterando a data da ultima ferias(ultima ferias antes de 4 meses)
		pessoaF.setFerias(LocalDate.of(2021, 8, 20));
		SolicitarFerias sfPJ = new SolicitarFerias(dataPJ, pessoaF.getDataAdmissao(), pessoaF.getFerias());
		System.out.println(sfPJ.Aprova());

		
	}
}
