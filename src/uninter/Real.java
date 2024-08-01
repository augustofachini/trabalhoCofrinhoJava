package uninter;

// classe real filha de moeda (estende moeda)
public class Real extends Moeda {

	// metodo construtor da moeda de real
	public Real(double valor) {
		this.valor = valor;
	}

	// metodo info implementado
	@Override
	public void info() {

		System.out.println("Real - " + valor);

	}

	// metodo converter implementado
	@Override
	public double converter() {
		return this.valor;
	}

	// sobrescrevendo o metodo da classe Object
	@Override
	public boolean equals(Object objeto) {
		// compara se a classe é diferente do objeto passado como argumento
		if (this.getClass() != objeto.getClass()) {
			return false;
		}

		// pegando o objeto da classe object e transformando em Real na variavel
		// objetoDeReal
		Real objetoDeReal = (Real) objeto;

		// comparando se o valor é diferente da classe chamada em relacao ao objeto
		// comparado
		if (this.valor != objetoDeReal.valor) {
			return false;
		}

		return true;
	}

}
