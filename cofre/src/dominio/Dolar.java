package dominio;

public class Dolar extends Moeda {
	// Construtor da classe Dolar que chama o construtor da superclasse Moeda
	public Dolar(Double valor, String nome) {
		super(valor, nome);

	}
	// Sobrescrita do método toString da classe Object para fornecer uma representação String do objeto
	@Override
	public String toString() {
		return "Moeda = " + nome + ": valor = " + valor + " | ";
	}
	// Específico da classe Dolar para fornecer informações adicionais sobre a moeda
	@Override
	void info() {
		System.out.println("Um dolar equivale 5 reais"); // Imprime uma mensagem informando a equivalência do Dólar em Reais
	}

}
