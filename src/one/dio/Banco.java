package one.dio;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void listarClientes() {
		System.out.println("\n\nLista de Clientes:\n");
		for (Conta c: contas) {
			System.out.println(c.cliente.getNome());
		}
	
	}

}