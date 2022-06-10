package br.com.senai.guimeireles.application.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import br.com.guimeireles.jpa.ejbbean.ComandosBean;
import br.com.senai.guimeireles.application.model.Despesas;


@SuppressWarnings("serial") //tira o erro da public class
@Named("tabela") //nome dado no binding do xhtml
@SessionScoped //Funciona enquanto o navegador estiver aberto
public class TabelaBean implements Serializable{
	
	//lista dos objetos da despesa
	private List<Despesas> despesas = new ArrayList<>();

	//delcaraçao de variavel
	String data1;
	String desc1;
	Double Valor1;
	String produtos;
	Boolean a = false; 

	private Despesas despesas1;
	
	@EJB //relaciona com o banco de dados
	private ComandosBean comandosBean;
	
	

	//getter e setter
	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public Double getValor1() {
		return Valor1;
	}

	public void setValor1(Double valor1) {
		Valor1 = valor1;
	}
	
	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	
	
	
//grava exclui e edita quando o user clicar na tabela
	public void gravarBanco(Despesas d) {
		comandosBean.inserir(d);
		
	}
	
	public void ExcluirBanco(Despesas d) {
		comandosBean.excluir(d);
		
	}
	public void EditarBanco(Despesas d) {
		comandosBean.atualizar(d);
		
	}
	
	//inseres as informações nas variavels
	public String inserir(String data,String desc,Double Valor) {
		
		//coloca as variaveis no objeto 
		Despesas d = new Despesas(data,desc,Valor);
		d.setEdit(true);
		
		//e insere na lista
		a =true;
		despesas.add(d);
		data1 = null;
		desc1 = null;
		Valor1= null;
		
		gravarBanco(d);
		
		return null;

	}
	
	public String excluir(Despesas despesa) {
		//remove os itens
		despesas.remove(despesa);
		ExcluirBanco(despesa);
		return null;
	}
	
	public String editar(Despesas despesa) {
		//edita as informações
		despesa.setEdit(true); 
		EditarBanco(despesa);
		return null;
	}
	
	public String gravar (Despesas despesa) {
		despesa.setEdit(false);
		//salva depois da informação vir do form, ou depois de ser editada
		if(despesa.getId()==null) {
			comandosBean.inserir(despesa);
		}else {
			comandosBean.atualizar(despesa);
		}
		return null;
	}
	
	//retorna na tabela com as despesas inseridas
	public List<Despesas> getDespesas() {
		
		return despesas;
	}
	
	public Despesas getDespesas1() {
		if(despesas1==null) {
			despesas1 = new Despesas();
		}
		return despesas1;
	}

	public Boolean getA() {
		return a;
	}

	public void setA(Boolean a) {
		this.a = a;
	}


	
}
