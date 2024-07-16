public class Main {

	public static void main(String[] args) {		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Cliente joao = new Cliente();
		joao.setNome("Joao");		
		Conta cc2 = new ContaCorrente(joao);
		Conta poupanca2 = new ContaPoupanca(joao);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.emprestimo(50);

		cc2.depositar(500);
		cc2.transferir(400, poupanca2);
		cc2.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();


	}

}
