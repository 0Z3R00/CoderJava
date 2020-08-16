package banco;

public class TestandoBanco {

	public static void main(String[] args) {
		Cliente cliente = new Cliente( 001, "Moura", "12345678", "16662882399");
		Cliente clienteCo = new Cliente( 002, "Nepomuceno", "12343335", "16644325674");
		
		Conta poupancaCli = new Poupanca(cliente, 0.07);
		Conta correnteCli = new Corrente(clienteCo, 800);

		//Poupança
		poupancaCli.Depositar(1000.0);
		System.out.println(poupancaCli.Consultar());
		poupancaCli.Sacar(400.70);
		System.out.println(poupancaCli.Consultar());
		poupancaCli.RecolherJuros();
		System.out.println(poupancaCli.Consultar());
		System.out.println(poupancaCli.Sacar(500));
		//Corrente
		correnteCli.Depositar(400);
		System.out.println(correnteCli.Consultar());
		System.out.println(correnteCli.Sacar(1200.00));
		System.out.println(correnteCli.Consultar());
		Cheque cheque = new Cheque(2000, "Santander", "19/08/2020");
		System.out.println(correnteCli.DepositoCheque(cheque));
		System.out.println(correnteCli.Consultar());
	}
}
