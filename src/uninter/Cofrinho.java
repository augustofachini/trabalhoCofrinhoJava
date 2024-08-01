package uninter;

import java.util.ArrayList;

public class Cofrinho {

	// lista que armazenara as moedas
	private ArrayList<Moeda> listaMoedas;

	public Cofrinho() {
		// iniciando uma lista vazia de moedas
		this.listaMoedas = new ArrayList<>();
	}

	// metodo para adicionar moedas ao cofrinho
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}

	// metodo para remover moedas do cofrinho
	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda);
	}

	// metodo para listar as moedas dentro do cofrinho
	public void listagemMoedas() {

		// checando caso a lista esteja vazia
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Nenhuma moeda no cofrinho.");
			return;
		}

		// passando pelas moedas e mostrando as infos de cada uma
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	//
	public double totalConvertido() {

		// checando caso a lista esteja vazia
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}

		// variavel com valor double inicializado com valor 0
		double valorConvertido = 0;

		// passando pelas moedas somando e convertendo os seus valores
		for (Moeda moeda : this.listaMoedas) {
			valorConvertido = valorConvertido + moeda.converter();
		}

		// retornando o valor convertido
		return valorConvertido;
	}

}
