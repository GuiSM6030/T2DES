import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class GenBean implements Serializable{
	
	private Integer max;
	private Integer min;
	private Integer[] quantidades;
	
	public Quant[] getQuantidades() {
		return Quant.QUANTIDADES;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public void setQuantidades(Integer[] quantidades) {
		this.quantidades = quantidades;
	}



}
