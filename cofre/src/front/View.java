package front;

import java.util.Scanner;

import dominio.Cofrinho;
import dominio.Dolar;
import dominio.Euro;
import dominio.Moeda;
import dominio.Real;

//TODO RESOLVER BUG DO NOME NULL E TERMINAS OUTRAS SOLICITAÇÕES DA TAREFA

public class View {
	static Scanner scanner = new Scanner(System.in);
	static Cofrinho cofrinho = new Cofrinho();

	public static void main(String[] args) {
		System.out.println("Bem vindo ao cofrinho");
		menuPrincipal();

	}
	//Exibir o menu principal e controlar as opções do usuário
	public static void menuPrincipal() {
		System.out.println("Digite o numero:");
		System.out.println("1 - Adicionar uma moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Converter moeda");
		System.out.println("4 - Lista de moedas");
		System.out.println("5 - Encerrar");
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			menuAdicionaMoedas();

			break;
		case 2:
			menuRemoveMoedas();

			break;
		case 3:
			menuConversorMoedas();

			break;
		case 4:
			if (cofrinho.listagemMoedas().size() == 0) {
				System.out.println("Não há moedas...");
				menuPrincipal();
			}
			System.out.println(cofrinho.listagemMoedas());
			menuPrincipal();
			break;
		case 5:
			System.out.println("Sistema finalizado...");
			menuPrincipal();
			
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}
	//Converter as moedas do cofrinho e exibir o valor total
	private static void menuConversorMoedas() {
		System.out.println("Calculando...");
		Double valorTotal= cofrinho.totalConvertido();
		System.out.println("valor total : " + valorTotal);
		menuPrincipal();
		
	}
	// Remover uma moeda do cofrinho
	private static void menuRemoveMoedas() {
		System.out.println("Qual posição da moeda deseja remover?");

		for (int posicao = 0; posicao < cofrinho.listagemMoedas().size(); posicao++) {
			System.out.println("posição " + posicao + " " + "| " + cofrinho.listagemMoedas().get(posicao));
		}

		int posicaoSelecionada = scanner.nextInt();
		cofrinho.removerMoeda(posicaoSelecionada);
		menuPrincipal();

	}
	// Adicionar uma moeda ao cofrinho
	public static void menuAdicionaMoedas() {
		System.out.println("Qual moeda você quer ?");
		System.out.println("1 - Euro");
		System.out.println("2 - Dolar");
		System.out.println("3 - Real");

		int opcaoMoeda = scanner.nextInt();
		switch (opcaoMoeda) {
		case 1:
			System.out.println("Quanto de euro você quer adicionar?");
			double valorEuro = scanner.nextDouble();
			Moeda euro = new Euro(valorEuro, "Euro");
			cofrinho.adicionarMoeda(euro);

			menuPrincipal();
			break;
		case 2:
			System.out.println("Quanto de dólar você quer adicionar?");
			double valorDolar = scanner.nextDouble();
			Moeda dolar = new Dolar(valorDolar, "Dolar");
			cofrinho.adicionarMoeda(dolar);

			menuPrincipal();
			break;
		case 3:
			System.out.println("Quanto de real você quer adicionar?");
			double valorReal = scanner.nextDouble();
			Moeda real = new Real(valorReal, "Real");
			cofrinho.adicionarMoeda(real);

			menuPrincipal();
			break;
		default:
			System.out.println("Moeda inválida.");
		}
	}

}
