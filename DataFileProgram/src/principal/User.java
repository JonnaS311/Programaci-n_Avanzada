package principal;

public class User {
	// cod
	private String cod;
        // nombre
	private String nom;
	
	User(String codI,String nomI){
		cod=codI;
		nom=nomI;
		
	}

	public String getCodigo() {
		return cod;
	}

	public void setCodigo(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nom;
	}

	public void setNombre(String nombre) {
		this.nom = nombre;
	}
	
	

}
