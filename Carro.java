package estacionamento.array;

public class Carro extends Veiculo {
	Motorista mot = new Motorista();
	private double posicaoOcupada = 1;
	private int cod=2;
	public Carro(String modelo, String placa, int horaEntrada, Motorista mot) {
		super(modelo, placa, horaEntrada);
		this.mot = mot;
	}

	public String calcularPreco(Veiculo veic, int horaSaida) {

		double preco;
		double totalHoras;
		totalHoras = horaSaida - getHoraEntrada();
		preco = (totalHoras * 2.5) + 2;

		return ("O valor total do veiculo de placa " + veic.getPlaca() + " e " + preco);

	}

	public int getCod() {
		return cod;
	}

	public double getPosicaoOcupada() {
		return posicaoOcupada;
	}

	@Override
	public String toString() {
		return "Carro [mot=" + mot + ", getModelo()=" + getModelo() + ", getPlaca()=" + getPlaca() + "]";
	}
}