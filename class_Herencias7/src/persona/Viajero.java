package persona;

public class Viajero {
	
	private String DNI;
	private String nombre, apellido1, nacionalidad, direccion;
	
	private static int numeroInstancias =0;
	
	
	
	
	
	

	public Viajero(String DNI, String nombre, String apellido1, String nacionalidad, String direccion) {
		
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		numeroInstancias++;
	}
	
	public static int getNumeroInstancias() {
		return numeroInstancias;
	}

	private String getDNI() {
		return DNI;
	}


	public void setDNI(String DNI) {
		DNI = DNI;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//recoger toda la info
	public String GetInfo() {
		return DNI + nombre +  apellido1 +   nacionalidad + direccion;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Viajero v1 = new Viajero("DNI ,", "nombre ,", "apellido1 , ", "nacionalidad", "direccion");
		Viajero v2 = new Viajero("DNI ,", "nombre ,", "apellido1 , ", "nacionalidad", "direccion");
		System.out.println(v1.GetInfo() + v1.getNumeroInstancias());
		System.out.println(v2.GetInfo() + v2.getNumeroInstancias());
		

	}

}
