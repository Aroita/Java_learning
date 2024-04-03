package herencia_polimosrfismo_2_class_abstractas_7;

public class Cd extends MaterialBiblioteca{
	
	private int pistas;

	public Cd(String titulo, String autor, int anioPublica, int pistas) {
		super(titulo, autor, anioPublica);
		this.pistas = pistas;
	}

	public int getPistas() {
		return pistas;
	}

	public void setPistas(int pistas) {
		this.pistas = pistas;
	}

	@Override
	public String toString() {
		return super.toString() + "Cd [pistas=" + pistas + "]";
	}
	
	
	
	

}
