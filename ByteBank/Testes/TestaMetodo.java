package ByteBank.Testes;

import ByteBank.ContaPrincipal;

public class TestaMetodo {
	public static void main(String[] args) {
		ContaPrincipal contaDoPaulo = new ContaPrincipal(6646,969060);
		contaDoPaulo.depositar(100);
		contaDoPaulo.depositar(50);
		System.out.println(contaDoPaulo.getSaldo());

		boolean conseguiuRetirar = contaDoPaulo.sacar(20);
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println(conseguiuRetirar);

		ContaPrincipal contaDaMarcela = new ContaPrincipal(6644,969063);
		contaDaMarcela.depositar(1000);

		boolean sucessoTransferencia = contaDaMarcela.transferencia(300, contaDoPaulo);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");
		}

		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoPaulo.getSaldo());
	}
}