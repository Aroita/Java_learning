package identificadoresEnClases_1;

import java.util.Scanner;

public class MetodoEquals_Compara {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escribe un nombre para la variable: nombre1 y se compara si es igual o no");
		String nombre1 = scanner.next()//scanner con strin --> next(), nextLine()...
;		String nombre2 = "Aroita";

	//con metodo equal() compara las 2 variables de nombre y devueleve un booleano
	
	System.out.println(nombre1.equals(nombre2));
	
	scanner.close(); //cerrarmos teclado

	}

}
