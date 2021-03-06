package cat.gencat.prueba.model;

public class Equipament {
	
	public static final String ID = "id";
	public static final String NOM = "nom";
	public static final String MUNICIPI = "municipi";

	private Long id;
	
	private String nom;
	
	private String municipi;
	
	public Equipament() {
		
	}
	
	public Equipament(Long id) {
		this.id =id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMunicipi() {
		return municipi;
	}

	public void setMunicipi(String municipi) {
		this.municipi = municipi;
	}	
	
	@Override
	public String toString() {
		return "Equipament [nom=" + nom + "]";
	}
	
}
