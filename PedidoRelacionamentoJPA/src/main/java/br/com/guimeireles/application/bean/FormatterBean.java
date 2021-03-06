package br.com.guimeireles.application.bean;


import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
//
public class FormatterBean implements Serializable {

	private static final Locale LOCALE_BR = new Locale("pt", "BR"); // Locale especifica um país 
	
	//põe o valor dependendo da moeda do país colocado no Locale
	public String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BR);
		return nf.format(valor);
	}
}
