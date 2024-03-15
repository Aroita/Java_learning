package estructuras_Control_Sentencias_2;

import java.util.Arrays;
import java.util.Scanner;

public class Supuestos_practicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
	//SUPUESTO 1
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escribre un nombre: ");
		String nombre = scanner.next();
		System.out.println("escribre primer apellido: ");
		String apellido1 = scanner.next();
		System.out.println("escribre segundo apellido: ");
		String apellido2 = scanner.next();
		
		//crea un array para almacenar los strings
		String resultado[] = {nombre,  apellido1,  apellido2};
		
		//ordena el array alfabeticamente
	    Arrays.sort(resultado);
	    
	    //Imprimir ordenadamente con FOR simplificado
	    System.out.println("  -- ordenados alfabeticamente: --");
	    for(String ordenando : resultado) {
	    	System.out.println(ordenando);
	    	
	    }

		
		
	    //SUPUESTO 2: app que puedas escribir palabras y para salir hay que escribir fin
	    Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("escribre una palabra: ");
		String palabrita = scanner2.nextLine();
	
		// !niega expresion
		while(!palabrita.equalsIgnoreCase("fin")) {
			
			System.out.println(palabrita);
			System.out.println("escribre una palabra o fin para salir: ");
			palabrita = scanner2.nextLine();
		}
		scanner2.close();
		System.out.println("programa cerrado");
		
	
		
		
		//SUPUESTO 3:app que reciba como parametro un año y calcule si es bisiesto o no
		Scanner scanner3 = new Scanner(System.in);
		
		
		System.out.println("escribe un año: ");
		int anio= scanner3.nextInt();
		
		if(esBisiesto(anio)) {
			System.out.println("el año " + anio + " es bisiesto");
		}else {
			System.out.println(anio + " NO es bisiesto");
			
		}
	};//funcion 
	public static boolean esBisiesto(int anio){  //bisiesto cada 4 años
		boolean resultado;
		
		//un año es bisiesto si es divisible entre 4 y 400 y no de 100
		resultado = ((anio % 4 == 0) && (anio % 100 != 0) || anio % 400 ==0);
		return resultado;
*/			
		
		 
	//SUPUESTO 4: CALCULADORA
		Scanner scanner4 = new Scanner(System.in);
		
		
		System.out.println("escribe un numero: ");
		int n01= scanner4.nextInt();
		
		System.out.println("escribe otro numero: ");
		int n02= scanner4.nextInt();
		
		
		System.out.println("escribe: \n 1.Sumar, \n 2.Restar, \n 3.Multiplicar, \n 4.Dividir, ");
		int op= scanner4.nextInt();
		
		switch(op) {
		case 1:
			int suma = n01 + n02;
			System.out.println(suma);
			break;
		case 2: 
			int resta = n01 - n02;
			System.out.println(resta);
			break;
		case 3:
			int multi = n01 * n02;
			System.out.println(multi);
			break;
		case 4: 
			int divide = n01 / n02;
			System.out.println(divide);
			break;
		default:
			System.out.println("numero no valido, fijate en el menú");
		};
	}


		}
		
		
		
		
	


