package simulacro4;

public class Aplicacion {
	
	private String nameApp;
	private int ram;
	private int disco;
	private boolean running;
	
	
	public Aplicacion(String nameApp, int ram, int disco) {
		this.nameApp = nameApp;
		this.ram = ram;
		this.disco = disco;
		this.running = false;
		
	}


	public String getNombre() {
		return nameApp;
	}


	public void setNameApp(String nameApp) {
		this.nameApp = nameApp;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getDisco() {
		return disco;
	}


	public void setDisco(int disco) {
		this.disco = disco;
	}


	public boolean isRunning() {
		return running;
	}


	public void setRunning(boolean running) {
		this.running = running;
	}
	
	public void run() {
		this.running = true;
	}
	
	public void stop() {
		this.running = false;
	}
	
	
	
	
	
	

}
