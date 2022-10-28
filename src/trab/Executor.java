package trabalho;

public class Executor {
	public static void main(String[] args) {
		Lista list = new Lista();
		System.out.println(list.siza());

		// Inserindo um elemento na lista ligada
		list.adicionaFinal(11);
		list.adicionaInicio(10);
		list.adicionaFinal(12);
		list.adicionaInicio(8);
		list.adicionaFinal(8);
		list.removeInicio();
		list.removeFim();
		list.adicionaInicio(9);
		list.adicionaInicio(0);
		// Verificando elementos da minha lista ligada
		list.mostrar();
		System.out.println(list.size());

	}

}