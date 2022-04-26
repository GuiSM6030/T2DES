
public class Linguagem {

	private Integer id;
	private String nome;
	
	
	public static final Linguagem[] LINGUAGENS;
	
	static {
		LINGUAGENS = new Linguagem[5];
		LINGUAGENS[0] = new Linguagem(1,"Java");
		LINGUAGENS[1] = new Linguagem(1,"IOS");
		LINGUAGENS[2] = new Linguagem(1,"C++");
		LINGUAGENS[3] = new Linguagem(1,"C#");
		LINGUAGENS[4] = new Linguagem(1,"PHP");
	}

	public Linguagem(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

}
