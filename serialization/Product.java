package serialization;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "Product [nome=" + nome + ", preco=" + preco + "]";
	}

	private String nome;
	private transient double preco;
	
	public Product() { }
	
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
