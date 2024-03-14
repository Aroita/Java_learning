package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class DeRepeticion_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*FOR: se usa cuando se sabe el nº exacto de iteracciones que debe realizar. Para inicializar, cumplir condicion,incrementar, decrementar...
	 *con Arrays
	 * */	
		
		//PRACTICO 1: Muestra los nº del 1 al 50
		System.out.println("--------- EJERCICIO PRACTICO 1 ---------");
		
		/*
		while(n1 < 50 ) {
			n1++;
			//System.out.println(n1);
		}
		
		igual que el while pero con FOR */
		for(int i=0; i< 50; i++ ) {
			System.out.print(i + 1 +" ");  // + 1 llega al 50
			
		}
		
		System.out.println();
		
		//PRACTICO 2: Muestra los nº PARES entre 1 a 100
		System.out.println("--------- EJERCICIO PRACTICO 2  ---------");
		for(int i=0; i <= 100; i+=2) {  //incrementamos en 2 en mede 1, y aseguramos q sea par
			//if(i%2 ==0) //que cada numero lo divide en 2 
			System.out.print(i + " ");
		}
		System.out.println();
		
		//PRACTICO 3: introduce nº por teclado, muestralo indefinidamente 
		//y paralo cuando introduces un 0
		
		System.out.println("--------- EJERCICIO PRACTICO 3  ---------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("escribe un nº, para salir pulsa 0");
		int num1 = scanner.nextInt();
		
		for( ; num1 != 0; ) {  //NO haria falta completar la sentencia entera de for ( int i=0; num1 != 0; i++ )
			System.out.println(num1);
			System.out.println("escribe un nº, para salir pulsa 0");
			num1 = scanner.nextInt(); //modifica la variable cada vez hasta que pongas 0
		}
		//si añadimos 0
		System.out.println("Has salido, adios");
		
	
		scanner.close();
		

	}

}
