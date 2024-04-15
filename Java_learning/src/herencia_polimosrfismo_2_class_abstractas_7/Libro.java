package herencia_polimosrfismo_2_class_abstractas_7;


//Libro hereda de MaterialBiblioteca
public class Libro extends MaterialBiblioteca{
	
	private String genero;
	
	
	//constructor
	public Libro(String titulo, String autor, int anioPublica, String genero) {
		super(titulo, autor, anioPublica);
		this.genero = genero;
	}
	

	//get y set
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	//toString de genero + llmamos al toString del padre: super.toString()
	@Override
	public String toString() {
		return super.toString()+ "Libro [genero=" + genero + "]";
	}
	
	
	
	
	
	

}
