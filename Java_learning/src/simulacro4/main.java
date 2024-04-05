package simulacro4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		Movil m1 = new Movil(6, 8);  // ram, disco)
		
		Aplicacion app1 = new Aplicacion("WhatsApp", -1, -1);  //nameApp, ram,  disco
        Aplicacion app2 = new Aplicacion("Facebook", 150, 70);
        Aplicacion app3 = new Aplicacion("Instagram", 120, 60);
		
		m1.instalarApp(app1);
		m1.instalarApp(app2);
		System.out.println("-----------");
		m1.ejecutarApp(app1);
		m1.ejecutarApp(app2);
		System.out.println("-----------");
		m1.desinstalarApp(app1);;
		m1.desinstalarApp(app2);;
		System.out.println("-----------");
		m1.pararApp(app1);
		m1.pararApp(app2);
		System.out.println("-----------");
		m1.desinstalarApp(app1);
		m1.desinstalarApp(app2);
		
		
		
		
		

	}

}
