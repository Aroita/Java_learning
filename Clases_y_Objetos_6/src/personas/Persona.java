package personas;

public class Persona {
	
	private final static int PESO_IDEAL = -1;
	private final static int PESO_POR_DEBAJO = 0;
	private final static int PESO_SOBREPESO = 1;
	
	private String nombre;
	private int edad;
	private String dni;
	private final static char SEXO = 'M' ;
	private double peso;
	private double altura;
	
	
	
	
	public Persona(String nombre, int edad, String dni, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		//this.SEXO = comprobarSexo(sexo);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + 
				", edad=" + edad + 
				", dni=" + dni + 
				", peso=" + peso + 
				", altura=" + altura
				+ "]";
	}




	//funciones
	public double calcularIMC() {
		double imc = peso / (altura * altura);
		if(imc < 20) {
			return PESO_IDEAL;
			
		}else if (imc >=20 && imc <= 25) {
			return PESO_POR_DEBAJO;
		}else {
			return PESO_SOBREPESO;
				
		}
		
	}
	
	void esMayorDeEdad() {
		
	}
	
	void comprobarSexo() {
		
	}
	
	//to string()

	
	void generarDni() {
		
	}


	public static char getSexo() {
		return SEXO;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//set
	
	
	
	
	
	
	
	
	

}
