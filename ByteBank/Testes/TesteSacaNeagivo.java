package ByteBank.Testes;

import ByteBank.ContaPrincipal;

public class TesteSacaNeagivo {
	public static void main(String[] args) {
		ContaPrincipal conta = new ContaPrincipal(6646,969060);
		conta.depositar(100);
		System.out.println(conta.sacar(101));

		conta.sacar(101);

		System.out.println(conta.getSaldo());
	}
}