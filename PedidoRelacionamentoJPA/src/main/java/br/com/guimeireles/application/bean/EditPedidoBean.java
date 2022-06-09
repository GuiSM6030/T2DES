package br.com.guimeireles.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.guimeireles.application.ejb.ClienteBean;
import br.com.guimeireles.application.ejb.PedidoBean;
import br.com.guimeireles.application.ejb.ProdutoBean;
import br.com.guimeireles.application.model.Cliente;
import br.com.guimeireles.application.model.Produto;


@Named
@RequestScoped
public class EditPedidoBean implements Serializable {
	
	@EJB //liga com banco de dados
	private PedidoBean pedidoBean;
	
	@EJB
	private ProdutoBean produtoBean;
	
	@EJB
	private ClienteBean clienteBean;
	
	private List<Cliente> clientes;
	private List<Produto> produtos;
	
	private Integer selectedClienteId;
	private Integer[] selectedProdutosIds;
	
	@PostConstruct //inicia os objetos depoia da criação do bean
	public void init() {
		clientes = clienteBean.listar();
		produtos = produtoBean.listar();
	}
	
	//Põe as info dependendo do ID
	public String cadastrarPedido() throws Exception {
		pedidoBean.cadastrar(selectedClienteId, selectedProdutosIds);	
		
		return "pedidos?faces-redirect=true";
	}
	
	//getter e setter
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Integer getSelectedClienteId() {
		return selectedClienteId;
	}

	public void setSelectedClienteId(Integer selectedClienteId) {
		this.selectedClienteId = selectedClienteId;
	}

	public Integer[] getSelectedProdutosIds() {
		return selectedProdutosIds;
	}

	public void setSelectedProdutosIds(Integer[] selectedProdutosIds) {
		this.selectedProdutosIds = selectedProdutosIds;
	}
}