package br.com.senai.guimeireles.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial") //Remove o erro do nome da classe
@Entity
public class Valor implements Serializable {

	@Id 
	@GeneratedValue //Esse e o de cima geram ID automaticamente
	private Integer id;
	
	//Especifica a coluna mapeada para um campo persistente
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Double valor;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override //Sobrescreve o método
	public String toString() {
		
		//Layout de como a informação vai para a tela
		return "Produto [id=" + id + ", nome=" + nome + ", valor=" + valor
				+ "]";
	}
}
