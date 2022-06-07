package br.com.rafaelcosta.application.bean;


import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class FormatterBean implements Serializable {

	private static final Locale LOCALE_BR = new Locale("pt", "BR"); // O Locale ele entrega 2 informaçõe, A lingua- e o Lugar(ex:"pt", "BR")
	
	public String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BR);//getCurrencyInstance-"pega a instância da moeda"
		return nf.format(valor);// vai retornar o valor com o R$
	}
}
