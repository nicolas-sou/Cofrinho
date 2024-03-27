package dominio;

public abstract class Moeda {
	public Double valor;
	public String nome;
	// Construtor da classe Moeda
	public Moeda(Double valor, String nome) {
		super();
		this.valor = valor;
		this.nome = nome;
	}
	// Abstrato para fornecer informações específicas sobre a moeda
	void info() {

	}
	// Converter o valor da moeda para outra moeda
	Double converter(Moeda moeda) {
		Double valorConvertido = 0.0;
		if (moeda.nome.equals("Dolar")) {
			valorConvertido = moeda.valor * 5;
		} else if (moeda.nome.equals("Euro")) {
			valorConvertido = moeda.valor * 5.45;
		}
		return valorConvertido;
	}
	  // Getters e setters para acessar e modificar os atributos valor e nome
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
