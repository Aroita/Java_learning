package herencias_4superClases_7;

public class Television extends Electrodomestico{
	
	private final static int RESOLUCION = 20;
	private final static boolean SINTONIZADOR = false;
	
	
	private int resolucion;
	private boolean sintonizador;
	
	//constructor por defecto
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizador = SINTONIZADOR;
	}

	public Television( double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION;
		this.sintonizador = SINTONIZADOR;
	}

	public Television(String color, char consumoEnergetico, double precio, double peso, int resolucion,
			boolean sintonizador) {
		super(color, consumoEnergetico, precio, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}


	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	
	//si la resolucion es mayor a 40 se incrementa el precio 30%
	//si tiene sintonizador aumenta 50 euro el precio
	@Override
	public double precioFinal() {
		double precioTv = super.precioFinal();
		if(resolucion > 40) {
			precioTv *= 1.30;
		}
		if(sintonizador ) {
			precioTv +=50;
		}
		return precioTv;
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	


