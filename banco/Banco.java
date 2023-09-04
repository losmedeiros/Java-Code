package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		Conta a  = new Conta("Conta de jose carlos");
		Conta b = new Conta("Conta de Abella");
		a.depositar(300);
		System.out.println(a.toString());
		System.out.println(b.toString());


	}

}
//