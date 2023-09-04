package modelos;

public class Conta {
	float saldo;
	String titular;
	

	public Conta (String titular) {
		saldo = 0;
		this.titular = titular;
	}
	public void depositar (float deposito) {
		saldo += deposito;
		}
	public void sacar (float sacar) {
		if(sacar > saldo){
			System.out.println("Saldo insuficiente Para completar o Saque.");
			System.out.println("Saldo: " + saldo + "reais");
			System.out.println("Tentativa de Saque: " + sacar + "reais");
			
			
		}
		else {
			saldo -= sacar;
		}
	}
	public String toString() {
		return "saldo: " + saldo + " reais na: " + titular;
			
	}

}
