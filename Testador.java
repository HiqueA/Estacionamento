package estacionamento.array;

public class Testador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorista m1 = new Motorista("marcelo", "33711092", "00000000000");
		Motorista m2 = new Motorista("joao", "33711092", "00000000000");
		Estacionamento est = new Estacionamento();

		// adiciona veiculo
		est.entrada(new Carro("gol", "mbj7676", 12, m1));
		est.entrada(new Moto("cb300", "aad7777", 14, m2));

		System.out.println(est.toString());
		System.out.println("****************************************************************");

		est.verificaVaga();

		System.out.println("****************************************************************");

		// lista por ordem

		est.listarVeiculosPlaca();
		System.out.println("****************************************************************");
		// remove veiculo e mostra o valor a ser pago
		Veiculo buscar = new Carro(null, "mbj7676", 12, null);

		est.saida(buscar);
		System.out.println(buscar.calcularPreco(buscar, 18));

		System.out.println("****************************************************************");
		System.out.println(est.toString());

		System.out.println("****************************************************************");
		est.verificaVaga();
	}

}
