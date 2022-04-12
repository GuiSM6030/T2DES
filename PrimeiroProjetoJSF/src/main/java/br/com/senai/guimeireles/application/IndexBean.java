package br.com.senai.guimeireles.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class IndexBean implements Serializable {

	
	public String getMenssagem() {
		
		return "Texto vindo do Bean";
		
	}
}
