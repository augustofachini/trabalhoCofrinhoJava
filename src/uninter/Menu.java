package uninter;

import java.util.Scanner;

public class Menu {

	// objeto Scanner para facilitar sua utilizacao
	private Scanner scan;
	// atributo cofrinho
	private Cofrinho cofrinho;

	// metodo construtor da classe Menu
	public Menu() {
		// Scanner para ler a entrada do teclado do usuario
		scan = new Scanner(System.in);
		// instanciando o cofrinho
		cofrinho = new Cofrinho();
	}

	// abrirMenu printa o menu na tela para o usuario escolher uma das opcoes
	public void abrirMenu() {
		try {
			System.out.println("--------------------");
			System.out.println("COFRINHO");
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Calcular valor total convertido para real");
			System.out.println("0 - Sair");

			// capturando a string digitada pelo usuario
			String opcaoEscolhida = scan.next();

			// Switch com cada opcao disponivel no menu
			switch (opcaoEscolhida) {

			case "0":
				System.out.println("Programa encerrado.");
				break;

			case "1":
				abrirSubMenu();
				abrirMenu();
				break;

			case "2":
				abrirSubMenuRemover();
				abrirMenu();
				break;

			case "3":
				System.out.println("Moedas dentro do cofrinho:");
				cofrinho.listagemMoedas();
				abrirMenu();
				break;

			case "4":
				double valorConvertido = cofrinho.totalConvertido();
				System.out.println("Valor total convertido para real: " + valorConvertido);
				abrirMenu();
				break;

			default:
				System.out.println("Opcao invalida, digite novamente!");
				abrirMenu();
				break;

			}

		} catch (Exception e) {
			System.out.println("Ocorreu um erro no programa, tente novamente!");
		}
		// final
	}

	// abrirSubMenu printa o sub menu na tela para o usuario escolher uma das opcoes
	private void abrirSubMenu() {
		try {
			System.out.println("Escolha a moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");

			// capturando o int digitado pelo usuario
			int moedaEscolhida = scan.nextInt();

			System.out.println("Digite o valor:");

			// capturando a string digitada pelo usuario
			String valorEscolhido = scan.next();

			// substituindo as virgulas pelo ponto para melhor organizacao
			valorEscolhido = valorEscolhido.replace(",", ".");

			// metodo para pegar o valor da string e transformar em double
			double doubleMoeda = Double.valueOf(valorEscolhido);

			// criando e inicializando em null a variavel moeda para dar valor
			// posteriormente atraves da opcao escolhida
			Moeda moeda = null;

			// selecao de moeda, real, dolar ou euro
			if (moedaEscolhida == 1) {

				// instanciando a moeda
				moeda = new Real(doubleMoeda);
			} else if (moedaEscolhida == 2) {
				moeda = new Dolar(doubleMoeda);
			} else if (moedaEscolhida == 3) {
				moeda = new Euro(doubleMoeda);
			} else {
				System.out.println("Moeda invalida!");
				abrirMenu();
			}

			// adicionando a moeda ao cofrinho atraves do metodo adicionar
			cofrinho.adicionar(moeda);
			System.out.println("Moeda adicionada!");

		} catch (Exception e) {
			System.out.println("Ocorreu um erro no programa, tente novamente!");
		}
		// final
	}

	// abrirSubMenuRemover printa o sub menu para remover moeda na tela para o
	// usuario escolher uma das opcoes
	private void abrirSubMenuRemover() {
		try {
			System.out.println("Escolha a moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			int moedaEscolhida = scan.nextInt();

			System.out.println("Digite o valor:");
			// capturando a string digitada pelo usuario
			String valorEscolhido = scan.next();

			// substituindo as virgulas pelo ponto para melhor organizacao
			valorEscolhido = valorEscolhido.replace(",", ".");

			// metodo para pegar o valor da string e transformar em double
			double doubleMoeda = Double.valueOf(valorEscolhido);

			// criando e inicializando em null a variavel moeda para dar valor
			// posteriormente atraves da opcao escolhida
			Moeda moeda = null;

			// selecao de moeda, real, dolar ou euro
			if (moedaEscolhida == 1) {

				// instanciando a moeda
				moeda = new Real(doubleMoeda);
			} else if (moedaEscolhida == 2) {
				moeda = new Dolar(doubleMoeda);
			} else if (moedaEscolhida == 3) {
				moeda = new Euro(doubleMoeda);
			} else {
				System.out.println("Moeda invalida!");
				abrirMenu();
			}

			// guardando resultado true ou falso na variavel moedaRemovida
			boolean moedaRemovida = cofrinho.remover(moeda);

			// comparando o resultado da variavel moedaRemovida para remover ou apontar caso
			// nao exista
			if (moedaRemovida) {
				System.out.println("Moeda removida!");
			} else {
				System.out.println("Moeda nao encontrada!");
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no programa, tente novamente!");
		}
		// final
	}

}
