package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class DeRepeticion_while {

	public static void main(String[] args) {
		// WHILE(condicion){}: si pones la 1º condicion falsa sera un bucle infinito
		
		//PRACTICO 1: Muestra los nº del 1 al 50
		/*System.out.println("--------- EJERCICIO PRACTICO 1 ---------");
		int n1= 0;
		
		while(n1 < 50 ) {
			n1++;
			//System.out.println(n1); //vista en vertical
			System.out.print(" " + n1);  //vista en horizontal
		}
		*/
		System.out.println();
		
		//PRACTICO 2: Muestra los nº PARES entre 1 a 100
		System.out.println("--------- EJERCICIO PRACTICO 2  ---------");
		int n2 =0;
		while(n2 <= 100) {
			if(n2 % 2 == 0) {  
				System.out.print(n2 + " ");
			}
			n2++;
		}
		
		//PRACTICO 3: introduce nº por teclado, muestralo indefinidamente 
		//y paralo cuando introduces un 0
		System.out.println("--------- EJERCICIO PRACTICO 3  ---------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce un nº, para salir pulsa 0");
		int num1 = scanner.nextInt();
		
		while(num1 != 0) {  //el bucle pasara tantas veces(infinito mientras sea falso) hasta que escribas el 0 y sale.
			System.out.println(num1);
			System.out.println("introduce un nº, --para salir pulsa 0");
			num1 = scanner.nextInt(); //se modifica la variable y recoge scanner
		}
		System.out.println("adios");
		
		scanner.close();

	}

}
