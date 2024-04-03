package Herencia_polimorfismo_1_class_Abstracta_7;

public class Termostato extends DispositivoElectronico {
	
	private Double  temperatura;

	public Termostato(String nombreDispositivo) {
		super(nombreDispositivo);
		this.temperatura = 0.0;
	}
	
	public void encender() {
		System.out.println("El termostato esta encendido");
		setEstadoActual(true);  //solo puedo llamar al metodo set y no a las variables
		temperatura = 36.1;
	}
	
	public void apagar() {
		System.out.println("El termostato esta apagada");
		setEstadoActual(false);
		temperatura = 0.0;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	
	//generar toString() de termostato
	@Override
	public String toString() {
		return "Termostato [temperatura=" + temperatura + "]";
	}
	
	
	
	
	
	
	
	
	

}
