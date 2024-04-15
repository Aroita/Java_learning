package clases;

public class Saludo {
	
	static String  comenzarSaludo = "Hola";
	String nombre = "Antonia";

	public static String getComenzarSaludo() {
		return comenzarSaludo ;
	}





	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saludo a1 = new Saludo();
		System.out.println(a1.getNombre()+ " " + a1.getComenzarSaludo() );
		
		

	}

}
