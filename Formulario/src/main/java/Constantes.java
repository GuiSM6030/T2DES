import java.util.ArrayList;
import java.util.List;

public class Constantes {
	
	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSES;
	
	//coloca as contanstes na list
	static {
		ESTADOS = new ArrayList<>();
		ESTADOS.add(new Estado("S�o Paulo", "SP"));
		ESTADOS.add(new Estado("Rio de Janeiro", "RJ"));
		ESTADOS.add(new Estado("Minas Gerais", "MG"));
		ESTADOS.add(new Estado("Esp�rito Santo", "ES"));
		
		
		INTERESSES = new ArrayList<>();
		INTERESSES.add(new Interesse(1, "Esportes"));
		INTERESSES.add(new Interesse(2, "T�nis de Mesa"));
		INTERESSES.add(new Interesse(3, "Cassino"));
		INTERESSES.add(new Interesse(4, "Rinha de an�o"));
}
}