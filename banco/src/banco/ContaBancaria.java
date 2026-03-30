package banco;

public class ContaBancaria {
	public int numeroDaConta;
	protected String tipo;
	private String usuario;
	private float saldo;
	private boolean status;
	

	public void abrirConta (String t) {
	this.setTipo(t);
	this.setStatus(true);
	if (t == "Corrente") {
		this.setSaldo(50f);
	}
	else if (t == "Poupança") {
		this.setSaldo(150f);
	}
	System.out.println("Conta aberta com Sucesso!");
	}
	public void fecharConta () {
		if (this.getSaldo() > 0) {
			System.out.println ("Erro ao fechar a conta! Zere seu saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
		public void sacar (float v) {
			if (this.isStatus()) {
				if (this.getSaldo() >= v) {
					this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado na conta de " + this.getUsuario(usuario));
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
			} else {
				System.out.println("impossivel sacar de uma conta fechada");
			}
			}
			
	public void depositar (float v) {
	if (this.isStatus() == true) {
		this.setSaldo(this.getSaldo() + v);
		System.out.println("Deposito realizado na conta de " + this.getUsuario(usuario));
	} else {
		System.out.println("Impossivel depositar em uma conta fechada");
	}
	
	}
	
	
	public void pagarMensal (float v) {
		this.setTipo(tipo);
		if (this.getTipo() == "Corrente") {
			v = 12;
		} else if (this.getTipo() == "Poupança") {
			v = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo());
			System.out.println("Mensalidade paga com sucesso por " + this.getUsuario(usuario));
		} else {
			System.out.println("Impossivel pagar uma conta fechada");
		}
	}
	public ContaBancaria () {
		this.saldo = 0;
		this.status = true;
		this.status = false;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int nC) {
		this.numeroDaConta = nC;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
		t = "Corrente";
		t = "Poupança";
	}
	public String getUsuario(String u) {
		return usuario;
	}
	public void setUsuario(String u) {
		this.usuario = u;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean st) {	
	this.status = st;
}
	void console (){
		System.out.println("===============================");
		System.out.println("Conta: " + this.getNumeroDaConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Usuário:" + this.getUsuario(usuario));
		System.out.println("Saldo: " + this.getSaldo ());
		System.out.println("Status: " + this.isStatus());
		System.out.println("===============================");
		
	}
	
	}
