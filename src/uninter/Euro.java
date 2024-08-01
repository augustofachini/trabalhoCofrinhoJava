package uninter;

//classe euro filha de moeda (estende moeda)
public class Euro extends Moeda {

	// metodo construtor da moeda de euro
	public Euro(double valor) {
		this.valor = valor;
	}

	// metodo info implementado
	@Override
	public void info() {

		System.out.println("Euro - " + valor);

	}

	// metodo converter implementado
	@Override
	public double converter() {
		// convertendo valor para real
		return this.valor * 5.39;
	}

	// sobrescrevendo o metodo da classe Object 
	@Override
	public boolean equals(Object objeto) {
		// compara se a classe é diferente do objeto passado como argumento
		if (this.getClass() != objeto.getClass()) {
			return false;
		}

		// pegando o objeto da classe object e transformando em Euro na variavel
		// objetoDeEuro
		Euro objetoDeEuro = (Euro) objeto;

		// comparando se o valor é diferente da classe chamada em relacao ao objeto
		// comparado
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}

		return true;
	}

}
