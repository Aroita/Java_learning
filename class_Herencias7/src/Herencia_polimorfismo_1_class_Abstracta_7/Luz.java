package Herencia_polimorfismo_1_class_Abstracta_7;


//hereda de DispositivoElectronico
public class Luz extends DispositivoElectronico {
	
	private int intensidad;
	
	public Luz (String nombreDispositivo) {
		super(nombreDispositivo);  //llama al constructor padre
		this.intensidad = 0;
	}
	
	public void encender() {
		System.out.println("luz encendida");
		setEstadoActual(true);  //solo puedo llamar al metodo set y no a las variables
	}
	
	public void apagar() {
		System.out.println("luz apagada");
		setEstadoActual(false);
	}
	
	//metodo por defecto de intensidad

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	
	
	//generar toString() de intensidad
	@Override
	public String toString() {
		return "Luz [intensidad=" + intensidad + "]";
	}
	
	
	

}
