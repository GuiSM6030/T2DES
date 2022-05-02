public class Interesse {

	private static Interesse interesse = new Interesse();
	
	private Integer id;
	private String area;
	
	public Interesse() {
		
	}
	
	public Interesse(Integer id, String area) {
		this.id = id;
		this.area = area;
	}
	
	public static Interesse getInteresse() {
		return interesse;
	}
	public static void setInteresse(Interesse interesse) {
		Interesse.interesse = interesse;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
