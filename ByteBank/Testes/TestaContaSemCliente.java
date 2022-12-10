package ByteBank.Testes;
import ByteBank.Cliente;
import ByteBank.ContaPrincipal;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		ContaPrincipal contaDaMarcela = new ContaPrincipal(6646,969060);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setNomeTitular(new Cliente());
		System.out.println(contaDaMarcela.getNomeTitular());

		contaDaMarcela.getNomeTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getNomeTitular().getNome());

	}
}