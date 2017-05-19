package estacionamento.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estacionamento {
	private int cont = 0;
	List<Veiculo> listaVagas = new ArrayList<Veiculo>();
	double totalVagas = 60;
	private int horaSaida;
	int vagasLivres = 0;
	int ocupada = 0;

	public void verificaVaga() {

		try {
			if (totalVagas < 0.5) {
				throw new SemVagasException();
			} else {
				System.out.println(totalVagas + " vagas Livres");
				
			}
		} catch (SemVagasException sv) {

			System.out.println("Não Existem mais Vagas");

		}

	}

	public void entrada(Veiculo veic) {
		if (veic.getCod() == 2 && totalVagas >= 1) {
			totalVagas = totalVagas - veic.getPosicaoOcupada();
			listaVagas.add(veic);
		} else if (veic.getCod() == 1 && totalVagas >= 0.5) {
			totalVagas = totalVagas - veic.getPosicaoOcupada();
			listaVagas.add(veic);
		}else{
			throw new SemVagasException();
		}

	}

	public void listarVeiculosPlaca() {
		Collections.sort(listaVagas, new PlacaProvider());
		for (Veiculo v : listaVagas) {
			System.out.println(v.getPlaca());
		}
	}

	public void saida(Veiculo buscar) {
		if (buscar.getCod() == 2) {

			listaVagas.remove(buscar);
			totalVagas = totalVagas + 1;
		} else if (buscar.getCod() == 1) {

			listaVagas.remove(buscar);
			totalVagas = totalVagas + 0.5;
		}

	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public int getVagasLivres() {
		return vagasLivres;
	}

	@Override
	public String toString() {
		return "Estacionamento [lista=" + listaVagas + "]";
	}
}
