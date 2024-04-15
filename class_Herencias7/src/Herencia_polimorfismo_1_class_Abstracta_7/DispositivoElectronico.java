package Herencia_polimorfismo_1_class_Abstracta_7;

public abstract class DispositivoElectronico {
	
	private String nombreDispositivo;
	private Boolean estadoActual;
	
	
	public DispositivoElectronico(String nombreDispositivo) {
		this.nombreDispositivo = nombreDispositivo;
		this.estadoActual = false;  //en principo estan apagados
	}
	

	public String getNombreDispositivo() {
		return nombreDispositivo;
	}


	public void setNombreDispositivo(String nombreDispositivo) {
		this.nombreDispositivo = nombreDispositivo;
	}


	public Boolean getEstadoActual() {
		return estadoActual;
	}


	public void setEstadoActual(Boolean estadoActual) {
		this.estadoActual = estadoActual;
	}


	//metodos declarados como abstracto no se añaden las llaves y codigo aqui
	public abstract void encender();
	
	
	public abstract void apagar();

	
	

}
