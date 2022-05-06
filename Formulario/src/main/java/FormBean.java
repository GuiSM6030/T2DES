
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class FormBean implements Serializable {

	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		if (pessoa == null) {
			pessoa = new Pessoa();
			pessoa.setEndRes(new Endereco());
			pessoa.getEndRes().setEstado(new Estado());
			pessoa.setEndCom(new Endereco());
			pessoa.getEndCom().setEstado(new Estado());
			pessoa.setTelRes(new Telefone());
			pessoa.setTelCel(new Telefone());
			pessoa.setTelCome(new Telefone());
			
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Estado> getEstados() {
		return Constantes.ESTADOS;
	}

	public List<Interesse> getInteresses() {
		return Constantes.INTERESSES;
	}
	
}