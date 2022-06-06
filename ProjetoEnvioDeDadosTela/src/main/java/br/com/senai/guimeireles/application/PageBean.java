package br.com.senai.guimeireles.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable{

	private String nome;

	public enum Pages{
		form, result;
	}

	@Inject //injeta o flash
	private Flash flash;

	public String processar() {
		//apresenta o nome que o usuario inseriu no xhtml
		flash.put("nomeDoUsuario", nome);

		return "result?faces-redirect=true";
	}

	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
