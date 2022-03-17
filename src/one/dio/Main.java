package one.dio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Cliente luiz = new Cliente("Luiz");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(luiz);
		
		contas.add(cc);
		contas.add(poupanca);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
		Banco banco = new Banco("Banco Eletrônico", contas);
		banco.listarClientes();
		
		Cartao cartao1 = new Cartao("0000 0000 0000 0001", "12/30", cc);
		System.out.println("\n\nNumero do cartão de "+cc.cliente.getNome()+" é "+cartao1.getNumeroCartao());
	}

}
