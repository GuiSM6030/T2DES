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

//Vai fazer a manipulação dos objetos
public class TabFormBean implements Serializable{
	
	//lista de onde vai ser colocadas os cadastros
	private List<Cadastro> despesas = new ArrayList<>();
	
	String date;
	String desc;
	Double valor;
	Boolean back = false; 
	
	//Getters e Setters
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
		
		//Construtor
		Cadastro d = new Cadastro(data,desc,valor); 
		d.setEdit(true);
		back =true;
		despesas.add(d);
		date = null;
		desc = null;
		valor= null;
		return null;
		
	}
	
	//Exclui da tabela o cadastro feito
	public String excluir(Cadastro despesa) {
		
		despesas.remove(despesa);
		
		return null;
	}
	
	//Edita os dados
	public String editar(Cadastro despesa) {
		despesa.setEdit(true); 
		
		return null;
	}
	
	//Salva os dados assim que eles saem do formulário, ou quando termina de editar
	public String gravar (Cadastro despesa) {
		despesa.setEdit(false);
		
		return null;
	}
	
	public List<Cadastro> getDespesas() {
		return despesas;
	}

	//Parte que decide onde vai abrir para edição ou vai deixar só mostrando
	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

}