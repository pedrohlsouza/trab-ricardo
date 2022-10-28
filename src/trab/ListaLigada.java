package trabalho;

public class Lista<T> {

	private No<T> primeiro;
	private int tamanho;

	public Lista() {
		primeiro = null;
		tamanho = 0;
	}

	public int gsize() {
		return tamanho;
	}

	public void adicionaInicio(T conteudo) {
		No<T> novoNo = new No<T>(conteudo, null, null);
		if (tamanho == 0) {
			primeiro = novoNo;
		} else {
			novoNo.setProx(primeiro);
			novoNo.santerior(null);
			primeiro.santerior(novoNo);
			primeiro = novoNo;
		}
		tamanho++;
	}

	public void removeInicio() {
		if(tamanho == 0) {
			System.out.println("Impossivel apagar a lista vazia");
		}if(tamanho == 1) {
		No<T> atual = primeiro.getProx();
		primeiro.setProx(null);
		primeiro.scont(null);
		atual.santerior(null);
		primeiro = atual;
		tamanho--;
	}}

	
	public void adicionaFinal(T conteudo) {
		if (tamanho == 0) {
			No<T> novoNo = new No<T>(conteudo, null, null);
			primeiro = novoNo;
		} else {
			No<T> atual = primeiro;
			while (atual.getProx() != null) {
				atual = atual.getProx();
			}
			No<T> novoNo = new No<T>(conteudo, null, atual);
			atual.setProx(novoNo);
		}
		tamanho++;
	}

	public void mostrar() {
		if (tamanho != 0) {
			No<T> atual = primeiro;
			int contador = 0;
			System.out.println("\n"+"cresente");
			while (atual.getProx() != null) {
				atual = atual.getProx();
				contador++;
			}
			System.out.println("\n"+"Decresente");
			while (atual.anterior() != null) {
				System.out.println("Nó na posição " + contador + " é igual a: " + atual.conteudo());
				atual = atual.anterior();
				contador--;
			}
			System.out.println("Nó na posição " + contador + " é igual a: " + atual.conteudo());
		} else {
			System.out.println("Lista vazia!");
		}

	}

		public void removeFim() {
		if(tamanho == 0) {
			System.out.println("Impossivel apagar a lista vazia");
		}
		if (tamanho == 1) {
			primeiro.scont(null);
			primeiro.santerior(null);
		}
		if (tamanho > 2) {
			No<T> atual = primeiro;
			int contador = 0;
			while (atual.getProx() != null) {
				System.out.println("Nó na posição " + contador + " é igual a: " + atual.conteudo());
				atual = atual.getProx();
				contador++;
			}
			No<T> ultimo = atual.anterior();
			atual.scont(null);
			atual.setProx(null);
			ultimo.setProx(null);
			tamanho--;
		}
	}
}