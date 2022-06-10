package br.com.senai.guimeireles.application.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SuppressWarnings("serial") //tira o erro da public class
@Named("login") //nome dado no binding do xhtml
@SessionScoped //Funciona enquanto o navegador estiver aberto
public class LoginBean implements Serializable{
	
	//declaração de variavel
	private String user;
	private String senha;

	//geter e setter
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String doLogin() {
		//validação login e senha
		if("abc".equals(user) && "123".equals(senha)) {
			return "despesas";	
		}
		return null;
	}
}
