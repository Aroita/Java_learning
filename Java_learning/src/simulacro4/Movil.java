package simulacro4;

public class Movil {

	private Aplicacion[] aplicaciones;
	private int ramTotal;
	private int discoTotal;
	private int numApps;

	public Movil(int ram, int disco) {
		this.ramTotal = ram;
		this.discoTotal = disco;
		this.aplicaciones = new Aplicacion[5];
		this.numApps=0;
	}

	// get y set
	public int getRam() {
		return ramTotal;
	}

	public int getDisco() {
		return discoTotal;
	}


	public void setRam(int ram) {
		this.ramTotal = ram;
	}

	public void setDisco(int disco) {
		this.discoTotal = disco;
	}



	// ----- METODO INSTALAR APP: acepta como parametro una app y la instala si hay
	// espacio en disco y crecera el array

	 // Métodos
	 // Métodos
    public void instalarApp(Aplicacion app) {
        if (this.numApps < this.aplicaciones.length && app.getDisco() <= this.discoTotal) {
            this.aplicaciones[this.numApps] = app;
            this.numApps++;
            this.discoTotal -= app.getDisco();
            System.out.println("La aplicación " + app.getNombre() + " ha sido instalada correctamente.");
        } else {
            System.out.println("NO HAY suficiente espacio en disco para instalar la aplicación " + app.getNombre());
        }
    }

    public void desinstalarApp(Aplicacion app) {
        for (int i = 0; i < this.numApps; i++) {
            if (this.aplicaciones[i] == app) {
                if (!app.isRunning()) {
                    // Si la aplicación no está corriendo, se puede desinstalar
                    this.discoTotal += app.getDisco();
                    this.aplicaciones[i] = null;
                    for (int j = i; j < this.numApps - 1; j++) {
                        this.aplicaciones[j] = this.aplicaciones[j + 1];
                    }
                    this.numApps--;
                    System.out.println("La aplicación " + app.getNombre() + " ha sido desinstalada correctamente.");
                    return;
                } else {
                    System.out.println("No SE PUEDE DESINSTALAR la aplicación " + app.getNombre() + " porque está en ejecución.");
                    return;
                }
            }
        }
        System.out.println("La aplicación " + app.getNombre() + " no está instalada en el móvil.");
    }

    public void ejecutarApp(Aplicacion app) {
        for (int i = 0; i < this.numApps; i++) {
            if (this.aplicaciones[i] == app) {
                if (!app.isRunning()) {
                    if (app.getRam() <= this.ramTotal) {
                        app.run();
                        this.ramTotal -= app.getRam();
                        System.out.println("La aplicación " + app.getNombre() + " se ha ejecutado correctamente.");
                        return;
                    } else {
                        System.out.println("NO HAY SUFIENETE memoria RAM para ejecutar la aplicación " + app.getNombre());
                        return;
                    }
                } else {
                    System.out.println("La aplicación " + app.getNombre() + " ya está en ejecución.");
                    return;
                }
            }
        }
        System.out.println("La aplicación " + app.getNombre() + " NO ESTA instalada en el móvil.");
    }

    public void pararApp(Aplicacion app) {
        for (int i = 0; i < this.numApps; i++) {
            if (this.aplicaciones[i] == app) {
                if (app.isRunning()) {
                    app.stop();
                    this.ramTotal += app.getRam();
                    System.out.println("La aplicación " + app.getNombre() + " se ha detenido correctamente.");
                    return;
                } else {
                    System.out.println("La aplicación " + app.getNombre() + " NO ESTA en ejecución.");
                    return;
                }
            }
        }
        System.out.println("La aplicación " + app.getNombre() + " NO ESTA instalada en el móvil.");
    }

    public Aplicacion encontrarApp(String nombreApp) {
        for (int i = 0; i < this.numApps; i++) {
            if (this.aplicaciones[i].getNombre().equals(nombreApp)) {
                return this.aplicaciones[i];
            }
        }
        return null;
    }

    public void listarApps() {
        System.out.println("Aplicaciones instaladas:");
        for (int i = 0; i < this.numApps; i++) {
            System.out.println("- " + this.aplicaciones[i].getNombre());
        }
    }

	

	
	
	
	
	
	 

}
