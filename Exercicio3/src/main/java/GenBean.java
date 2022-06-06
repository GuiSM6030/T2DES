import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class GenBean implements Serializable {

	//instancia método random
	private static Random random = new Random();

	//declaração de variavel
	private Integer qtde;
	private Integer min;
	private Integer max;

	//Arraylist
	private List<Integer> numeros = new ArrayList<>();

	public String gerar() {

		//Gera os numeros aleatoriamente
		for (int i = 0; i < qtde; i++) {
			int n = random.nextInt(max - min) + min + 1;
			numeros.add(n);
		}

		return null;
	}

	//getter e setter
	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
}
