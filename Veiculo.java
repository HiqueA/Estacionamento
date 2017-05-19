package estacionamento.array;

public class Veiculo {

	private String modelo;
	private String placa;
	private int horaEntrada;
	private int posicaoOcupada;
	private int cod;
	public Veiculo(String modelo, String placa, int horaEntrada) {
		super();
		this.setHoraEntrada(horaEntrada);
		this.modelo = modelo;
		this.placa = placa;
		this.posicaoOcupada=posicaoOcupada;;
		this.cod= cod;
	}

	public String calcularPreco(Veiculo veic, int horaSaida) {
		return this.calcularPreco(veic, horaSaida);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public int getCod() {
		return cod;
	}
	
	public double getPosicaoOcupada() {
		return posicaoOcupada;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Veiculo veic = (Veiculo) obj;

		return this.getPlaca().equalsIgnoreCase(veic.getPlaca());
	}

}
