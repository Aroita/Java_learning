package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class DSeleccion_if_ASCII {

	
	//CONSULTAR TABLA ASCII:
	//letras MAYUSCULAS desde 65 a 90
	//letras minusculas 97 a 122
	public static void tipoCaracter(char c) {
		int rango = (int)c;
		if((rango < 65 || rango <= 90 ) || (rango >= 97 && rango <=122)) {
			
		
			//vocales MAYUSC. 65, 69,73, 79, 85  //vocales minusc. 97, 101, 105, 111, 118
			if(rango == 65 || rango == 69 ||rango == 73 || rango == 79 || rango == 85 || 
					rango == 97 || rango == 101 || rango == 111 || rango == 118 ) {
				System.out.println("es una vocal");
				
				}else 
					System.out.println("es una consonate");
				
		}else
		System.out.println("NO ES UNA LETRA");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRACTICO 4: programa q solicite un caracter y diga si es vocal o consonante. pasar el caracter a una funcion
		System.out.println("--------- EJERCICIO PRACTICO 4 ---------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escribe un caracter: ");
		char caracter = scanner.next().charAt(0);  //.charAt(0) coge el 1º caracter del texto que recoge scanner.next()
		System.out.println(caracter);
		
		//casting
		System.out.println("ID de ASCII: "+ (int)caracter);  //mostrara el Nº ID deL caracter de ASCII
		
		//funciones
		System.out.println("Primer letra caracter: " + caracter);
		DSeleccion_if_ASCII.tipoCaracter(caracter);  //muestra la letra
		


	}

}
