package uninter;

//classe dolar filha de moeda (estende moeda)
public class Dolar extends Moeda {

	// metodo construtor da moeda de dolar
	public Dolar(double valor) {
		this.valor = valor;
	}

	// metodo info implementado
	@Override
	public void info() {

		System.out.println("Dolar - " + valor);

	}

	// metodo converter implementado
	@Override
	public double converter() {
		// convertendo valor para real
		return this.valor * 4.94;
	}

	// sobrescrevendo o metodo da classe Object
	@Override
	public boolean equals(Object objeto) {
		// compara se a classe é diferente do objeto passado como argumento
		if (this.getClass() != objeto.getClass()) {
			return false;
		}

		// pegando o objeto da classe object e transformando em Dolar na variavel
		// objetoDeDolar
		Dolar objetoDeDolar = (Dolar) objeto;

		// comparando se o valor é diferente da classe chamada em relacao ao objeto
		// comparado
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}

		return true;
	}

}
