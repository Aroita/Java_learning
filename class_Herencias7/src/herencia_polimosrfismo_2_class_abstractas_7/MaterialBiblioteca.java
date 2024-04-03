package herencia_polimosrfismo_2_class_abstractas_7;

public abstract class MaterialBiblioteca {
	
	private String titulo;
	private String autor;
	private int anioPublica;
	
	
	public MaterialBiblioteca(String titulo, String autor, int anioPublica) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublica = anioPublica;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAnioPublica() {
		return anioPublica;
	}


	public void setAnioPublica(int anioPublica) {
		this.anioPublica = anioPublica;
	}


	//generate toString
	@Override
	public String toString() {
		return "MaterialBiblioteca [titulo=" + titulo + ", autor=" + autor + ", anioPublica=" + anioPublica + "]";
	}
	
	
	
	
	
	
	
	

}
