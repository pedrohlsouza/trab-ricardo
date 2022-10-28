package trabalho;

public class No<T> {
	private T conteudo;
	private No<T> proximo;
	private No<T> anterior;

	public No(T conteudo, No<T> proximo, No<T>anterior) {
		this.conteudo = conteudo;
		this.proximo = proximo;
		this.anterior = anterior;
	}

	public T conteudo() {
		return conteudo;
	}

	public void scont(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProx() {
		return proximo;
	}

	public void setProx(No<T> proximo) {
		this.proximo = proximo;
	}

	public No<T> anterior() {
		return anterior;
	}

	public void santerior(No<T> anterior) {
		this.anterior = anterior;
	}
}