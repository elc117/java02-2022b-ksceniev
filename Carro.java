
public class Carro {
	private String modelo;
	private String cor;
	private double preco;
	private int quatidade;
	
	public Carro() {
		super();
	}
	
	

	public Carro(String modelo, String cor, double preco, int quatidade) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.quatidade = quatidade;
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}
	
	
	
	private int calculo(double desconto) {
		desconto = 0.5;
		double valor = desconto / preco;
		System.out.println("Com o desconto de 5% a vista, seu carro será R$ " + valor);
		return (int) desconto;
	}

}