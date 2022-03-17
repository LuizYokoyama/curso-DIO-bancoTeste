package one.dio;

public class Cartao {
	
	private String numeroCartao;
	private String validade;
	private Conta conta;
	public Cartao(String numeroCartao, String validade, Conta conta) {
		super();
		this.numeroCartao = numeroCartao;
		this.validade = validade;
		this.conta = conta;
	}
	protected String getNumeroCartao() {
		return numeroCartao;
	}
	
	protected void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	protected Conta getConta() {
		return conta;
	}

	
}
