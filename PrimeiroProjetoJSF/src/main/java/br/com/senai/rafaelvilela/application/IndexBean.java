package br.com.senai.rafaelvilela.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class IndexBean implements Serializable {

	//Texto que vai aparecer no xhtml
	public String getMensagem() {
		return "Texto vindo do Bean";
	}
}
