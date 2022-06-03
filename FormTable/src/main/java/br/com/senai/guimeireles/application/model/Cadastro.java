package br.com.senai.guimeireles.application.model;

public class Cadastro {
private String date;
private String desc;
private Double valor;
private Boolean edit;

public String getDate() {
	return date;
}


public Cadastro(String date, String descricao, Double valor) {
	super();
	this.date = date;
	this.desc = descricao;
	this.valor = valor;
}

public Cadastro() {
	this.date = date;
	this.desc = desc;
	this.valor = valor;
}


public void setDate(String data) {
	this.date = data;
}
public String getDescricao() {
	return desc;
}
public void setDescricao(String descricao) {
	this.desc = descricao;
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
