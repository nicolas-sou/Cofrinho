package dominio;

public class Real extends Moeda{
	// Declaração da classe Real, que é uma subclasse de Moeda
	public Real(Double valor, String nome) {// Construtor da classe Real
		super(valor, nome); // Chama o construtor da superclasse Moeda, passando os parâmetros valor e nome
	}
	// Sobrescrita do método toString da classe Object
	@Override
	public String toString() {
		return "Moeda = " + nome + ": valor = " + valor + " | "; // Retorna uma representação em formato de string da moeda
	}

}
