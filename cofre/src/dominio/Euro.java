package dominio;

public class Euro extends Moeda {
	// Construtor da classe Euro que chama o construtor da superclasse Moeda
	public Euro(Double valor, String nome) {
		super(valor, "Euro");
	}
	// Sobrescrita do método toString da classe Object para fornecer uma representação String do objeto
	@Override
	public String toString() {
		return "Moeda = " + nome + ": valor = " + valor + " | ";
	}
	 // Específico da classe Euro para fornecer informações adicionais sobre a moeda
	@Override
	void info() {
		System.out.println("Um Euro equivale 5.45 reais"); // Imprime uma mensagem informando a equivalência do Euro em Reais
	}

}
