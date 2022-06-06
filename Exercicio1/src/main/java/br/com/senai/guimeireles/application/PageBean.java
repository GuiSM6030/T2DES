package br.com.senai.guimeireles.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable{

	//declara variavel
	private int num1;
	private int num2;
	private int num3;
	private int res;

	@Inject //injeta o flash no java
	private Flash flash;

	public String somar() {
		//operação da soma
		flash.put("result", (num1 + num2 + num3));
		//resultado
		return "result";
	}

	//getter e setter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}



}