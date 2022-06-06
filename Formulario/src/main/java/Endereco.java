
public class Endereco {

	private static Endereco endereco = new Endereco();
	
	//declaração de variavel
	private String rua;
	private Integer num;
	private String comp;
	private String bairro;
	private String cep;
	private String cidade;
	private Estado estado;
	
	
	//getter e setter
	public static Endereco getEndereco() {
		return endereco;
	}

	public static void setEndereco(Endereco endereco) {
		Endereco.endereco = endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		
	}

}
