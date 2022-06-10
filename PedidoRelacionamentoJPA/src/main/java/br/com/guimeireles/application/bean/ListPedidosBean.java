package br.com.guimeireles.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.guimeireles.application.ejb.PedidoBean;
import br.com.guimeireles.application.model.Pedido;


@Named
@RequestScoped //fica vivo durante toda a aplicação
public class ListPedidosBean implements Serializable {

	@EJB 
	private PedidoBean pedidoBean;
	
	private List<Pedido> pedidos;
	
	@PostConstruct 
	public void init() {
		pedidos = pedidoBean.listar();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	//pega a forma de pagamente
	public String pagar(Integer pedidoId, String tipo) throws Exception  {
		pedidoBean.pagar(pedidoId, tipo);
		//põe na tela
		return "pedidos?faces-redirect=true"; 
	}
	
	//exclui as informações pelo ID
	public String excluir(Integer pedidoId) {
		pedidoBean.excluir(pedidoId);
		return "pedidos?faces-redirect=true";
	}
}