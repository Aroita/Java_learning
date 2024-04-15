package simulacro4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		Movil m1 = new Movil(6, 8);  // ram, disco)
		
		Aplicacion app1 = new Aplicacion("WhatsApp", -1, -1);  //nameApp, ram,  disco
        Aplicacion app2 = new Aplicacion("Facebook", 150, 70);
       
		
		m1.instalarApp(app1);
		//La aplicación WhatsApp ha sido instalada correctamente.
		m1.instalarApp(app2);
		//NO HAY suficiente espacio en disco para instalar la aplicación Facebook
		System.out.println("-----------");
		m1.ejecutarApp(app1);
		// La aplicación WhatsApp se ha ejecutado correctamente.
		m1.ejecutarApp(app2);
		//La aplicación Facebook no está instalada en el móvil.
		System.out.println("-----------");
		m1.desinstalarApp(app1);;
		//No SE PUEDE DESINSTALAR la aplicación WhatsApp porque está en ejecución.
		m1.desinstalarApp(app2);;
		//La aplicación Facebook no está instalada en el móvil.
		System.out.println("-----------");
		m1.pararApp(app1);
		//La aplicación WhatsApp se ha detenido correctamente.
		m1.pararApp(app2);
		//La aplicación Facebook NO ESTA instalada en el móvil.
		System.out.println("-----------");
		m1.desinstalarApp(app1);
		//La aplicación WhatsApp ha sido desinstalada correctamente.
		m1.desinstalarApp(app2);
		//La aplicación Facebook no está instalada en el móvil.

		
		
		
		
		

	}

}
