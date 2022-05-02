
public class Estado {

	private static Estado estado = new Estado();
	
	public Estado() {
		
	}
	
	public Estado(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	private String nome;
	private String sigla;
	
	
	public static Estado getEstado() {
		return estado;
	}
	public static void setEstado(Estado estado) {
		Estado.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
