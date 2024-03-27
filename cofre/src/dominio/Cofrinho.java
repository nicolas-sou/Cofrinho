package dominio;

import java.util.ArrayList;
public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();

	// Retornar a lista de moedas contidas no cofrinho
	public ArrayList<Moeda> listagemMoedas() {
		return listaMoedas;
	}

	// Semelhante ao anterior, poderia ser removido sem impactar o código
	public void adicionarMoeda(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}

	// Remover uma moeda da lista de moedas no cofrinho com base na posição
	// fornecida
	public void removerMoeda(int posicao) {
		this.listaMoedas.remove(posicao);
	}

	// Calcular e retornar o valor total convertido de todas as moedas no cofrinho
	public Double totalConvertido() {
		Double valorTotal = 0.0;
		Double valorEuro = 5.45;
		Double valorDolar = 5.00;
		// Itera sobre cada moeda na lista de moedas
		for (Moeda moeda : listaMoedas) {
			if (moeda.getNome().equals("Euro")) {
				valorTotal += moeda.getValor() * valorEuro;
			} else if (moeda.getNome().equals("Dolar")) {
				valorTotal += moeda.getValor() * valorDolar;
			}
		}
		return valorTotal; // Retorna o valor total convertido

	}
}
