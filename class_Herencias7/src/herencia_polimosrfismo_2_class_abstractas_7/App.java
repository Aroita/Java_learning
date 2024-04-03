package herencia_polimosrfismo_2_class_abstractas_7;

public class App {

	public static void main(String[] args) {

		//creamos las intancias de objetos de las clases hijas
		Libro l1 = new Libro("titulo", "autor", 2022, "genero");
		
		Revista r1 = new Revista("titulo2", "autor2", 2021, "tipo2");
		
		Cd c1 = new Cd("titulo3", "autor3", 2020, 4);
		
		System.out.println(l1.toString());
		System.out.println("------------");
		System.out.println(r1.toString());
		System.out.println("------------");
		System.out.println(c1.toString());
		System.out.println("-------------");
		
		
		// #### OTRA FORMA CON POLIMOSRFISMO, HACE LO MISMO QUE EJEMPLO DE ARRIBA
		//polimorfismo para materialBiblioteca, crear el array y NO un objeto, 
		//para obtener elementos libro, revista y cd
		MaterialBiblioteca[] m1 = new MaterialBiblioteca[3];
		m1[0]=l1;
		m1[1]=r1;
		m1[2]=c1;
		
		for(int i=0; i<m1.length; i++ ) {
			System.out.println(m1[i].toString());
			
			
		}
		
		
		
		
		

	}

}
