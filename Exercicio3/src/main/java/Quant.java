public class Quant {


	public static Quant[] QUANTIDADES;
	private Integer id;
	private Integer numeros;
	 
	static {
		QUANTIDADES = new Quant [5];
		QUANTIDADES[0] = new Quant(1,1);
		QUANTIDADES[1] = new Quant(2,2);
		QUANTIDADES[2] = new Quant(3,3);
		QUANTIDADES[3] = new Quant(4,4);
		QUANTIDADES[4] = new Quant(5,5);
		
	}

	public Quant(Integer id, Integer integer) {
		this.id = id;
		this.numeros = integer;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeros() {
		return numeros;
	}

	public void setNumeros(Integer numeros) {
		this.numeros = numeros;
	}


	

	
}