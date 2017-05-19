package estacionamento.array;

public class Moto extends Veiculo {
	Motorista mot = new Motorista();
	private double posicaoOcupada = 0.5;
	private int cod=1;
	public Moto(String modelo, String placa, int horaEntrada, Motorista mot) {
		super(modelo, placa, horaEntrada);
		this.mot = mot;
	}

	public String calcularPreco(Veiculo veic, int horaSaida) {

		double preco;
		double totalHoras;
		totalHoras = horaSaida - getHoraEntrada();
		preco = (totalHoras * 1.5) + 2;

		return ("O valor total do veiculo de placa " + getPlaca() + " e " + preco);

	}

	public double getPosicaoOcupada() {
		return posicaoOcupada;
	}
	

	public int getCod() {
		return cod;
	}

	@Override
	public String toString() {
		return "Moto [mot=" + mot + ", getModelo()=" + getModelo() + ", getPlaca()=" + getPlaca() + "]";
	}

}
