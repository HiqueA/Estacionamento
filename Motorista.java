package estacionamento.array;

public class Motorista {

	private String nome;
	private String numero;
	private String cpf;

	public Motorista() {
		super();
	}

	public Motorista(String nome, String numero, String cpf) {
		super();

		this.nome = nome;
		this.numero = numero;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", numero=" + numero + ", cpf=" + cpf + "]";
	}
}
