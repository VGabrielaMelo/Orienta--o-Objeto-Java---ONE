package ByteBank.Testes;

import ByteBank.Cliente;
import ByteBank.ContaPrincipal;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222.-22");

		ContaPrincipal contaDoPaulo = new ContaPrincipal(6646,969060);
		contaDoPaulo.depositar(100);

		contaDoPaulo.setNomeTitular(paulo);
		System.out.println(contaDoPaulo.getNomeTitular().getNome());
		System.out.println(contaDoPaulo.getNomeTitular());
	}
}