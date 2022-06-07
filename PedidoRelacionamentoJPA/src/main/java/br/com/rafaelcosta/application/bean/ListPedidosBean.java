package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rafaelcosta.application.ejb.PedidoBean;
import br.com.rafaelcosta.application.model.Pedido;


@Named
@RequestScoped // vai ficar vivo durante toda a aplicação
public class ListPedidosBean implements Serializable {

	@EJB //obs: precisa criar para fazer a gravação no banco de dados
	private PedidoBean pedidoBean;
	
	private List<Pedido> pedidos;
	
	@PostConstruct //Carrega os pedido que foram feitos e guardam dentro do List
	public void init() {
		pedidos = pedidoBean.listar();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public String pagar(Integer pedidoId, String tipo) throws Exception  {
		pedidoBean.pagar(pedidoId, tipo);
		return "pedidos?faces-redirect=true"; // puxa as informações do banco de dados.
	}
	
	public String excluir(Integer pedidoId) {
		pedidoBean.excluir(pedidoId);
		return "pedidos?faces-redirect=true";
	}
}
