package br.com.senai.guimeireles.application;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.guimeireles.application.model.Cadastro;

@SuppressWarnings("serial") 
@Named("tabela")
@SessionScoped 
public class FormBean implements Serializable{
	
	private List<Cadastro> despesas = new ArrayList<>();
	
	Boolean back = false; 
	
	private Cadastro cadastro;
	
	
	public Cadastro getCadastro() {
		if(cadastro==null) {
			cadastro = new Cadastro();
		}
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public void setDespesas(List<Cadastro> despesas) {
		this.despesas = despesas;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor1) {
		valor = valor1;
	}

	
	
	
	
	public String inserir(String data,String desc,Double valor) {
		
		Cadastro d = new Cadastro(data,desc,valor); 
		d.setEdit(true);
		back =true;
		despesas.add(d);
		date = null;
		desc = null;
		valor= null;
		return null;
		
	}
	
	public String excluir(Cadastro despesa) {
		
		despesas.remove(despesa);
		
		return null;
	}
	
	public String editar(Cadastro despesa) {
		despesa.setEdit(true); 
		
		return null;
	}
	
	public String gravar (Cadastro despesa) {
		despesa.setEdit(false);
		
		return null;
	}
	
	public List<Cadastro> getDespesas() {
		return despesas;
	}

	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

}