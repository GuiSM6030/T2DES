package br.com.senai.guimeireles.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//cria tabela
@Entity
public class Produtos {
	
	//cria id automaticamente
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Double valor;
	
	//getter e setter
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
	
}
