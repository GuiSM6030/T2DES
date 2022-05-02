import java.util.ArrayList;
import java.util.List;

public class Constantes {
	
	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSES;
	
	static {
		ESTADOS = new ArrayList<>();
		ESTADOS.add(new Estado("São Paulo", "SP"));
		ESTADOS.add(new Estado("Rio de Janeiro", "RJ"));
		ESTADOS.add(new Estado("Minas Gerais", "MG"));
		ESTADOS.add(new Estado("Espírito Santo", "ES"));
		
		
		INTERESSES = new ArrayList<>();
		INTERESSES.add(new Interesse(1, "Esportes"));
}
}