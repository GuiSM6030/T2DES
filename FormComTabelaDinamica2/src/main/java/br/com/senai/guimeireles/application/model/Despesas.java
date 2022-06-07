package br.com.senai.guimeireles.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Despesas {
//atributos primitivos n�o podem ser nulos, por isso usamos os wrappers
private String data;
private String descricao;
private Double valor;
private Boolean edit;


@Id
@GeneratedValue
private Integer id;




public Despesas(String data, String descricao, Double valor) {
	super();
	this.data = data;
	this.descricao = descricao;
	this.valor = valor;

}

public Despesas() {
	
	
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}
public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public Boolean getEdit() {
	return edit;
}
public void setEdit(Boolean edit) {
	this.edit = edit;
}




	
}
