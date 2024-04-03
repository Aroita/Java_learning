package herencia_polimosrfismo_2_class_abstractas_7;

public class Revista extends MaterialBiblioteca{
	
	private String tipo;

	public Revista(String titulo, String autor, int anioPublica, String tipo) {
		super(titulo, autor, anioPublica);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " Revista [tipo=" + tipo + "]";
	}
	
	
	
	
	
	

}
