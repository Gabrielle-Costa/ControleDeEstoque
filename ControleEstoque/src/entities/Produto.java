package entities;

import java.util.Objects;

public class Produto {
	
	private String nome;
	private Integer quantidade;
	private Double preco;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Integer quantidade, Double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Produto(String nome, Integer quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

}