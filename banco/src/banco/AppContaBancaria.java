package banco;



public class AppContaBancaria {

	public static void main(String[] args) {
	
		System.out.println("========== Banco Cajamaster ===========");
		ContaBancaria pessoa1= new ContaBancaria ();
	pessoa1.numeroDaConta = 123874;
	pessoa1.setUsuario("Marcio");
	pessoa1.abrirConta("Poupança");
	pessoa1.depositar(300);
	pessoa1.sacar(100);
		pessoa1.console();

		ContaBancaria pessoa2= new ContaBancaria ();
		pessoa2.numeroDaConta = 123874;
		pessoa2.setUsuario("Joana");
		pessoa2.abrirConta("Corrente");
		pessoa2.depositar(750);
		pessoa2.sacar(100);
			pessoa2.console();
			
			ContaBancaria pessoa3= new ContaBancaria ();
			pessoa3.numeroDaConta = 123874;
			pessoa3.setUsuario("Neide");
			pessoa3.abrirConta("Corrente");
			pessoa3.depositar(750);
			pessoa3.sacar(100);
				pessoa3.console();
			
	
		
		
	}

}
