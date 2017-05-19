package estacionamento.array;

import java.util.Comparator;

public class PlacaProvider implements Comparator<Veiculo>{

	@Override
	public int compare(Veiculo v1, Veiculo v2) {
		// TODO Auto-generated method stub
		return v1.getPlaca().compareTo(v2.getPlaca());
	}

}
