package herencias_4superClases_7;

public class Lavadora extends Electrodomestico {
	
	private double carga;
	
	private final static double CARGA_DEFAULT = 5;

	public Lavadora(String color, char consumoEnergetico, double precio, double peso, double carga) {
		super(color, consumoEnergetico, precio, peso);
		this.carga = carga;
	}
	
	public Lavadora( double precio, double peso) {
		super( precio, peso);
		this.carga = CARGA_DEFAULT;
	}


	public Lavadora() {
		super();
		this.carga = CARGA_DEFAULT;
	}


	

	public double getCarga() {
		return carga;
	}

	//sobreescribir el metodo padre
	public double precioFinal() {
		// TODO Auto-generated method stub
		double d = super.precioFinal();
		if(carga>30) {
			d += 50;
		}
		return d;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
