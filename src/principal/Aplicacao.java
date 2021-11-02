package principal;

import model.Cliente;

public class Aplicacao {
	public static void main(String[] args) {
		// Criação do objeto cliente a partir da classe Cliente
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo(1);
		cliente1.setNome("Maria");		
		System.out.println(cliente1.getCodigo() +" - "+ cliente1.getNome());
	}
}
