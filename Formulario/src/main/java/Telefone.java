
public class Telefone {
	
	private static Telefone telefone = new Telefone();

	//declaração de variavel
	private String ddd;
	private String numero;
	private Tipo tipo;
	
	public enum Tipo{
		FIXO, CELULAR;
}

	//getter e setter
	public static Telefone getTelefone() {
		return telefone;
	}

	public static void setTelefone(Telefone telefone) {
		Telefone.telefone = telefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	
	
}
