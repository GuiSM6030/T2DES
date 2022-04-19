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

	@Inject
	private Flash flash;
	
	public String processar() {
		
		flash.put("nomeDoUsuario", nome);
		
		return "result?faces-redirect=true";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
