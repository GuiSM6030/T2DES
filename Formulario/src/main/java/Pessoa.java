
import java.util.Date;


public class Pessoa {

	private static Pessoa pessoa = new Pessoa();

	private String nome;
	private String email;
	private Date dtNasc;
	private Endereco endRes;
	private Telefone telRes;
	private Telefone telCel;
	private String nomeEmp;
	private Endereco endCom;
	private Telefone telCom;
	private String cargo;
	private Double salario;
	private Integer[] interesses;
	
	
	
	public static Pessoa getPessoa() {
		return pessoa;
	}
	public static void setPessoa(Pessoa pessoa) {
		Pessoa.pessoa = pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public Endereco getEndRes() {
		return endRes;
	}
	public void setEndRes(Endereco endRes) {
		this.endRes = endRes;
	}
	public Telefone getTelRes() {
		return telRes;
	}
	public void setTelRes(Telefone telRes) {
		this.telRes = telRes;
	}
	public Telefone getTelCel() {
		return telCel;
	}
	public void setTelCel(Telefone telCel) {
		this.telCel = telCel;
	}
	public String getNomeEmp() {
		return nomeEmp;
	}
	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}
	public Endereco getEndCom() {
		return endCom;
	}
	public void setEndCom(Endereco endCom) {
		this.endCom = endCom;
	}
	public Telefone getTelCom() {
		return telCom;
	}
	public void setTelCome(Telefone telCome) {
		this.telCom = telCome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Integer[] getInteresses() {
		return interesses;
	}
	public void setInteresses(Integer[] interesses) {
		this.interesses = interesses;
	}
	
	
	
	
	
}