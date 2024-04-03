package poo_4;

public class FirstClase {
	
	private String nombre;
	private int edad;
	private Double salario;
	
	public FirstClase(String nombre, int edad, Double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClase ob1 = new FirstClase("nombre", 33, 1400.0);
		
		System.out.println("Detalles: " + ob1.nombre + " , " + ob1.edad+" , " + ob1.salario);
		
		//modificamos salario y edad
		ob1.setSalario(1550.0);
		ob1.setEdad(34);
		
		System.out.println("Detalles: " + ob1.nombre + " , " + ob1.edad+" , " + ob1.salario);
		
		
		
		

	}

	
	
	


	
	

}
